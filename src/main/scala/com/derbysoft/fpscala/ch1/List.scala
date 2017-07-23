package com.derbysoft.fpscala.ch1

import java.io.File
import java.util

import scala.collection.JavaConversions._
import org.apache.commons.io.{FileUtils, IOUtils}

object List {

  def main(args: Array[String]): Unit = {
    val fileName = "/Users/xinliwang/workspace/fpinscala/src/main/scala/com/derbysoft/fpscala/ch1/List.scala"
    val iterator = FileUtils.lineIterator(new File(fileName), "UTF-8")
    iterator.foreach(println)
    iterator.close()
  }
}
