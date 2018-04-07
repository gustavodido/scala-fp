package introduction

import scala.io.Source.stdin

class SolveMeFirst {
  def run() {
    val sum: Int = stdin
      .getLines()
      .take(2)
      .map(_.toInt)
      .sum

    println(sum)
  }
}
