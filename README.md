# Scodec benchmarks

## Results on my laptop

### FooBenchmark

Scodec version: 1.6.0 (scodec-bits 1.0.6)

Mode: avgt

Cnt: 200

Units: microseconds/op (lower is better)

| Benchmark                |     Score |   Error  |
| ------------------------ | ---------:| --------:|
| FooBenchmark.decode      |    21.179 | ±  0.059 |
| FooBenchmark.encode      |    10.780 | ±  0.035 |
| FooBenchmark.toBase64    | 20590.997 | ± 55.067 |
| FooBenchmark.toByteArray |   115.872 | ±  0.683 |
