package introduction

import java.lang.Math.pow

import language.postfixOps

class EvaluatingPower {

  implicit class IntegerExtensions(wrapped: Int) {
    def fact() = 2.to(wrapped).product
  }

  def f(num: Double): String = {
    val sum = 1.0 +
      1.to(9)
        .toArray
        .map(b => pow(num, b) / b.fact)
        .sum

    "%.4f".format(sum)
  }
}
