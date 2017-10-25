name := """notes"""
organization := "behatechconsultants"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
    guice,
    cache,
    ws,
    specs2 % Test,
    "org.webjars" %% "webjars-play" % "2.6.1",
    "org.webjars" % "react" % "15.6.1",
    "org.webjars.npm" % "react-dom" % "16.0.0",
    "org.webjars" % "react-router" % "2.4.0",
    "org.webjars" % "react-bootstrap" % "0.28.1",
    "org.webjars" % "marked" % "0.3.2-1",
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
    "com.google.firebase" % "firebase-server-sdk" % "3.0.1",
)



// Adds additional packages into Twirl
// TwirlKeys.templateImports += "behatechconsultants.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "behatechconsultants.binders._"

