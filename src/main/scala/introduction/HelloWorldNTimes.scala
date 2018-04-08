package introduction

import common.Exercise

import scala.io.Source.stdin

class HelloWorldNTimes extends Exercise {
  def solve() {
    val n: Int = stdin
      .getLines()
      .take(1)
      .map(_.toInt)
      .sum

    for(i <- 1 to n) {
      println("Hello World")
    }
  }
}
