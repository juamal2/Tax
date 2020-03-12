import Tax.Tax

object Main {
  def main(args: Array[String]): Unit = {

    val tax = new Tax

    tax.taxBrackets(Tuple2(10000, 30000)) = 0.1
    tax.taxBrackets(Tuple2(30000, 100000)) = 0.25
    tax.taxBrackets(Tuple2(100000, -1)) = 0.4
//    println(tax.doTax(12000))
//    println(tax.doTax(56789))
//    println(tax.doTax(1234567))

    println(tax.totalTax(0)) // 0
    println(tax.totalTax(10000)) // 0
    println(tax.totalTax(10010)) // 1
    println(tax.totalTax(12000)) // 200
    println(tax.totalTax(56789)) // 8697
    println(tax.totalTax(1234567)) //473326

    //println(tax.superTax(20000, tax.taxBrackets.head))

  }
}
