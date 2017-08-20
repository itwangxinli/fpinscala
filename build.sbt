name := "fpinscala"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Local Repo" at "file://" + Path.userHome.getAbsolutePath + "/.m2/repository"


libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.1",
  "mysql" % "mysql-connector-java" % "5.1.34"
)
