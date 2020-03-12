package Word

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

class WordFunnel {

  var wordList = (for (line <- Source.fromFile("src/main/scala/Word/Words").getLines) yield line).toList

  def getWordsRemove(word: String): List[String] = {
    (for (i <- 1 to word.length) yield word.substring(0, i - 1) + word.substring(i, word.length)).toList
  }

  def isValidWord(word: String, wordList: List[String]): Boolean = {
    var isValid = false
    for (words <- wordList) {
      if (words == word) isValid = true
    }
    isValid
  }

  def funnel(initWord: String, count: Int): Int = {
    val validWords = getWordsRemove(initWord)
    val actualValidWords = ArrayBuffer[String]()
    for (valid <- validWords) {
      if (isValidWord(valid, wordList)) {
        actualValidWords.append(valid)
      }
    }
    if (actualValidWords.length < 1) {
      count
    }
    else {
      (for (word <- actualValidWords) yield funnel(word, count + 1)).max
    }

  }

}
