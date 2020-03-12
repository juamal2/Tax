import Word.WordFunnel

object Main {
  def main(args: Array[String]): Unit = {

    val wordFun = new WordFunnel
    println(wordFun.funnel("gnash", 1))
    println(wordFun.funnel("princesses", 1))
    println(wordFun.funnel("turntables", 1))






//    val tax = new Tax
//    println(tax.totalTax(0)) // 0
//    println(tax.totalTax(10000)) // 0
//    println(tax.totalTax(10010)) // 1
//    println(tax.totalTax(12000)) // 200
//    println(tax.totalTax(56789)) // 8697
//    println(tax.totalTax(1234567)) //473326

  }
}
