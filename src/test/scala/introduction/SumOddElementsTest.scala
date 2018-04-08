package introduction

import org.scalatest.FlatSpec

class SumOddElementsTest extends FlatSpec {
  "SumOddElements" should "sum all elements in odd positions" in {
    val input = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
    val output = 16

    assert((new SumOddElements).f(input) == output)
  }

}
