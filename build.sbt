name := "ziocrypt"

version := "0.1"

scalaVersion := "2.12.9"

scalacOptions := Seq(
  "-feature",
  "-deprecation",
  "-explaintypes",
  "-unchecked",
  "-Xfuture",
  "-encoding", "UTF-8",
  "-language:higherKinds",
  "-language:existentials",
  "-Ypartial-unification",
  "-Xfatal-warnings",
  "-Xlint:-infer-any,_",
  "-Ywarn-value-discard",
  "-Ywarn-numeric-widen",
  "-Ywarn-extra-implicit",
  "-Ywarn-unused:_",
  "-Ywarn-inaccessible",
  "-Ywarn-nullary-override",
  "-Ywarn-nullary-unit",
  "-opt:l:inline"
)

libraryDependencies ++= {
  val zioVersion = "1.0.0-RC12-1"

  Seq(
    "dev.zio" %% "zio" % zioVersion,
    "dev.zio" %% "zio-streams" % zioVersion,

    "com.github.pureconfig" %% "pureconfig" % "0.11.1",

    "org.slf4j" % "slf4j-api" % "1.7.+",
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",

    "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  )
}