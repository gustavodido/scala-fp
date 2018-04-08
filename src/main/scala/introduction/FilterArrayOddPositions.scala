package introduction

class FilterArrayOddPositions {
  private def isOdd(num: Int): Boolean = (num % 2) == 1

  def f(arr: List[Int]): List[Int] =
    arr
      .zipWithIndex
      .filter(tuple => isOdd(tuple._2))
      .map(tuple => tuple._1)
}
