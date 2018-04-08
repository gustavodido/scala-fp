package introduction

import org.scalatest.FlatSpec

class FilterArrayOddPositionsTest extends FlatSpec {
  "FilterArrayPositions" should "remove odd indexes from the list" in {
    val input = List(2, 5, 3, 4, 6, 7, 9, 8)
    val output = List(5, 4, 7, 8)

    assert((new FilterArrayOddPositions).f(input) == output)
  }
}
