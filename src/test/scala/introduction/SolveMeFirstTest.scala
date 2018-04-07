package introduction

import common.InOutTest

class SolveMeFirstTest extends InOutTest {
  "SolveMeFirst" should "sum two regular numbers" in {
    val input = "1\n4\n"
    val output = "5\n"

    assertExercise(new SolveMeFirst, input, output)
  }
}
