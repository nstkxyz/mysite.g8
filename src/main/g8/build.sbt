
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "xyz.nstk"
ThisBuild / scalaVersion := "2.13.5"

lazy val root = (project in file("."))
  .settings(
    name := "MyBlog"
  )
  .enablePlugins(MyBlogPlugin)
