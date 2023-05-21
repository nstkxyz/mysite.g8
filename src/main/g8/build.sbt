ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "xyz.nstk"
ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "MySiteProject",
    libraryDependencies ++= Seq(
      "xyz.nstk" %% "mysite" % "0.1.0-SNAPSHOT",
      "xyz.nstk" %% "mysitedefaulttheme" % "0.1.0-SNAPSHOT"
    )
  )
  .enablePlugins(MySitePlugin)
