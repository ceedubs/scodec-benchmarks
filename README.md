# Scodec benchmarks

## Results on my laptop

### FooBenchmark (1.6.0)

[Source](https://github.com/ceedubs/scodec-benchmarks/blob/b01482bf390fc271efc3c5e8ad35ff08045ab02b/src/main/scala/FooBenchmark.scala)

Scodec version: 1.6.0 (scodec-bits 1.0.6)

Scala version: 2.10.4

Mode: avgt

Cnt: 200

Units: microseconds/op (lower is better)

| Benchmark                |     Score |   Error  |
| ------------------------ | ---------:| --------:|
| FooBenchmark.decode      |    21.179 | ±  0.059 |
| FooBenchmark.encode      |    10.780 | ±  0.035 |
| FooBenchmark.toBase64    | 20590.997 | ± 55.067 |
| FooBenchmark.toByteArray |   115.872 | ±  0.683 |

### FooBenchmark (1.7.1)

[Source](https://github.com/ceedubs/scodec-benchmarks/blob/293212e3f0f17ac5e493d743f2044d4120a2bd13/src/main/scala/FooBenchmark.scala)

Scodec version: 1.7.1

Scala version: 2.10.5

Mode: avgt

Cnt: 200

Units: microseconds/op (lower is better)

| Benchmark                |     Score |   Error  |
| ------------------------ | ---------:| --------:|
| FooBenchmark.decode      |    20.901 | ±  0.055 |
| FooBenchmark.encode      |    10.737 | ±  0.022 |
| FooBenchmark.toBase64    | 20566.721 | ± 66.604 |
| FooBenchmark.toByteArray |   119.997 | ±  0.370 |
