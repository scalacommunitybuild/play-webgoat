lazy val `play-webgoat` = (project in file(".")).enablePlugins(PlayScala)

crossScalaVersions := Seq("2.12.18")
scalaVersion := crossScalaVersions.value.head // tc-skip

libraryDependencies ++= Seq(guice, ws)
scalacOptions ++= Seq(
  "-feature", "-unchecked", "-deprecation", "-Xfatal-warnings",
  // "unused" is too fragile w/ Twirl, routes file
  "-Xlint:-unused"
)
