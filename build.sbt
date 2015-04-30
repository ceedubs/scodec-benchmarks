jmhSettings

libraryDependencies ++= Seq(
  "org.typelevel" %% "scodec-core" % "1.6.0" exclude("org.typelevel", "scodec-bits"),
  // this is pulled in by scodec-core, but the newer patch has optimizations.
  "org.scodec" %% "scodec-bits" % "1.0.6"
)
