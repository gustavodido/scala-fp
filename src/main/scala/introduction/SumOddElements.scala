package introduction

class SumOddElements {
  private def isOdd(num: Int): Boolean = (num % 2) == 1

  def f(arr: List[Int]): Int =
    arr
      .filter(isOdd)
      .sum
}
