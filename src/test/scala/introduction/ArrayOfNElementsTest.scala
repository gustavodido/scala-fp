package introduction

import org.scalatest.FlatSpec

class ArrayOfNElementsTest extends FlatSpec {
  "ArrayOfNElements" should "generate a list of N elemens starting at 0" in {
    val input = 10
    val output = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    assert((new ArrayOfNElements).f(input) == output)
  }
}
