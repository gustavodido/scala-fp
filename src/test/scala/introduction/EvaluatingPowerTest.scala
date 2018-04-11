package introduction

import org.scalatest.FlatSpec

class EvaluatingPowerTest extends FlatSpec {
  "EvaluatingPower" should "should evaluate the first testing scenario" in {
    val input = 20.0000
    val output = "2423600.1887"

    assert((new EvaluatingPower).f(input) == output)
  }

  "EvaluatingPower" should "should evaluate the second testing scenario" in {
    val input = 5.0000
    val output = "143.6895"

    assert((new EvaluatingPower).f(input) == output)
  }

  "EvaluatingPower" should "should evaluate the third testing scenario" in {
    val input = 0.5000
    val output = "1.6487"

    assert((new EvaluatingPower).f(input) == output)
  }

  "EvaluatingPower" should "should evaluate the fourth testing scenario" in {
    val input = -0.5000
    val output = "0.6065"

    assert((new EvaluatingPower).f(input) == output)
  }

}
