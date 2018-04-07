package introduction

import common.Exercise

import scala.io.Source.stdin

class SolveMeFirst extends Exercise {
  def solve() {
    val sum: Int = stdin
      .getLines()
      .take(2)
      .map(_.toInt)
      .sum

    println(sum)
  }
}
