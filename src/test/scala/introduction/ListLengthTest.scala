package introduction

import org.scalatest.FlatSpec

class ListLengthTest extends FlatSpec {
  "ListLength" should "count number of items" in {
    val input = List(2, 5, 3, 4, 6, 7, 9, 8)
    val output = 8

    assert((new ListLength).f(input) == output)

  }
}
