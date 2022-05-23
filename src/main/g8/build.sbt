ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "xyz.nstk"
ThisBuild / scalaVersion := "2.12.12"

lazy val root = (project in file("."))
  .settings(
    name := "MySite"
  )
  .enablePlugins(MySitePlugin)
