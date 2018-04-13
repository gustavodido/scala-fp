package introduction

import org.scalatest.FlatSpec

class AreaVolumesCurvesTest extends FlatSpec {
  "AreaVolumesCurves" should "calculate the area and the volume around x-axis" in {
    val coefficients = List(1, 2, 3, 4, 5)
    val powers = List(6, 7, 8, 9, 10)
    val upperLimit = 1
    val lowerLimit = 4

    val output = 26172951168940.8

    assert((new AreaVolumesCurves).summation(upperLimit, lowerLimit, coefficients, powers) == output)
  }
}
