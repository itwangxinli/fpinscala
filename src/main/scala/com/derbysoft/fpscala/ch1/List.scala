package com.derbysoft.fpscala.ch1

import scala.annotation.tailrec

object List {
  def f(n: BigInt): BigInt = {
    if (n == 1) 1
    else n * f(n - 1)
  }

  def ft(n: BigInt): BigInt = {
    @tailrec
    def tailrec2(n: BigInt, value: BigInt): BigInt = {
      if (n == 1) value
      else tailrec2(n - 1, (n - 1) * value)
    }

    tailrec2(n, n)
  }

  def main(args: Array[String]): Unit = {
    //    val i = f(5000)
    val i = ft(6)
    println(i)
  }
}
