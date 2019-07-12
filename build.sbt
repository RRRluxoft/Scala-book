name := "scala"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "junit" % "junit" % "4.11" % Test
libraryDependencies += "com.github.junitrunner" % "junitrunner" % "0.0.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10"

resolvers += "Typesafe Repository" at "http://repo.typesafe/releases/"

//mainClass in(Compile, packageBin) := Some("Main")
//mainClass in(Compile, run) := Some("Main")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.19",
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "com.typesafe.akka" %% "akka-stream" % "2.5.19"
)
