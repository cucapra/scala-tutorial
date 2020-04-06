name := "Interpreter"
version := "0.0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "com.lihaoyi" %% "fastparse" % "2.2.2",
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Ywarn-unused",
  "-Ywarn-value-discard",
)
