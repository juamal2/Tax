package Tax

class Tax {

  val taxBrackets = scala.collection.mutable.Map[Tuple2[Int, Int], Double]()

  def totalTax(income: Int): Int = {
    var result: Double = 0.0
    taxBrackets.foreach(value => result += (superTax(income, value._1, value._2)))
    result.toInt
  }

  def superTax(income: Int, bracket: Tuple2[Int, Int], tax: Double): Double = {
    var value: Double = income
    if (income > bracket._2 & bracket._2 > bracket._1) {
      value = bracket._2
    }
    if (value - bracket._1 > 0) (value - bracket._1) * tax else 0.0
  }

}
