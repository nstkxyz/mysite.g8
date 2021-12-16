name := "MyBlog"
version := "0.1.0-SNAPSHOT"
organization := "xyz.nstk"
scalaVersion := "2.13.5"

lazy val root = (project in file("."))
  .enablePlugins(MyBlogPlugin)
