package introduction

class ArrayOfNElements {
  def f(num: Int): List[Int] =
    List
      .fill(num)(1)
      .zipWithIndex
      .map(tuple => tuple._2)
}
