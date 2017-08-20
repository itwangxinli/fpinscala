package com.derbysoft.fpscala.ch1

object Discount {
  def calculateDiscount(prices: Seq[Double]): Double = {
    prices filter (price => price >= 20.0) map (price => price * 0.10) sum
  }

  def main(args: Array[String]): Unit = {
        println(calculateDiscount(Seq(5, 20, 30, 50, 18.8)))
  }

  def discount(percent: Double) = {
    if (percent < 0.0 || percent > 100.0)
      throw new IllegalArgumentException("Discounts must be between 0.0 and 100.0.")
    (originalPrice: Double) => originalPrice - (originalPrice * percent * 0.01)
  }

}
