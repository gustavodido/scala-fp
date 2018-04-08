package introduction

class ListReplication  {
  def f(num: Int, arr: List[Int]): List[Int] =
    arr.flatMap(List.fill(num)(_))
    // arr.flatMap(elem => List.fill(num)(elem))
}
