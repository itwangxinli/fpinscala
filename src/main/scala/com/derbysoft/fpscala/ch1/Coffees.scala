package com.derbysoft.fpscala.ch1

import slick.jdbc.MySQLProfile.api._


class Coffees(tag: Tag) extends Table[(String, Int, Double, Int, Int)](tag, "COFFEES") {
  val suppliers = TableQuery[Suppliers]

  def name = column[String]("COF_NAME", O.PrimaryKey)

  def supID = column[Int]("SUP_ID")

  def price = column[Double]("PRICE")

  def sales = column[Int]("SALES")

  def total = column[Int]("TOTAL")

  def * = (name, supID, price, sales, total)

  // A reified foreign key relation that can be navigated to create a join
  def supplier = foreignKey("SUP_FK", supID, suppliers)(_.id)
}