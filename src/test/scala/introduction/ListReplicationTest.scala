package introduction

import org.scalatest.FlatSpec

class ListReplicationTest extends FlatSpec {
  "ListReplication" should "replicate each element by N times" in {
    val result = (new ListReplication).f(2, 1 :: 2 :: 3 :: Nil)
    assert(result == List(1, 1, 2, 2, 3, 3))
  }
}
