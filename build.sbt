jmhSettings

scalaVersion := "2.10.5"

libraryDependencies += "org.scodec" %% "scodec-core" % "1.8.1"

// Shapeless 2.1.0 on Scala 2.10 requires macro paradise
libraryDependencies ++= {
 if (scalaBinaryVersion.value startsWith "2.10") Seq(compilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full)) else Nil
}
