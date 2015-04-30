package ceedubs.scodecbenchmarks

import org.openjdk.jmh.annotations._
import java.util.concurrent.TimeUnit
import scodec.bits.BitVector
import scodec._
import scodec.codecs._
import scalaz.\/

@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
class FooBenchmark {
  val foo: Foo = Foo(
    "this is a foo name",
    (0L until 20L).toVector,
    (0L until 30L).toVector,
    (0L until 10L).toVector,
    (0L until 5L).toVector,
    (0L until 20L).toVector)

  val vl: Codec[Vector[Long]] = vectorOfN(uint(5), int64)

  implicit val codecFoo: Codec[Foo] =
    (variableSizeBytes(uint(5), utf8) :: vl :: vl :: vl :: vl :: vl).as[Foo]

  val encoded: BitVector = encode.toOption.get // YOLO

  assert(decode.isRight)

  @Benchmark def encode: Err \/ BitVector =
    codecFoo.encode(foo)

  @Benchmark def toByteArray: Array[Byte] =
    encoded.toByteArray

  @Benchmark def toBase64: String =
    encoded.toBase64

  @Benchmark def decode: Err \/ (BitVector, Foo) =
    codecFoo.decode(encoded)
}
