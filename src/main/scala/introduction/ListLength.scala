package introduction

class ListLength {
  def f(arr: List[Int]): Int =
//    arr
//      .map(_ => 1)
//      .sum
  arr match  {
    case head::tail => f(tail) + 1
    case Nil => 0
  }
}
