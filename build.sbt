import Dependencies._

ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.kata"
ThisBuild / organizationName := "kata"

lazy val root = (project in file("."))
  .settings(
    name := "kata2",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += scalaCheck % Test
  )
