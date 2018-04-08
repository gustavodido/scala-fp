package introduction

import org.scalatest.FlatSpec

class ReverseListTest extends FlatSpec {
  "ReverseList" should "reverse list" in {
    val input = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val output = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).reverse

    assert((new ReverseList).f(input) == output)
  }

}
