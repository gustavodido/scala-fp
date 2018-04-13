package introduction

class AreaVolumesCurves {
  def f(coefficients: List[Int], powers: List[Int], x: Double): Double =
    coefficients.zip(powers)
      .foldLeft(0.0) { case (acc, (c, p)) => acc + c * math.pow(x, p) }

  def area(coefficients: List[Int], powers: List[Int], x: Double): Double =
    math.Pi * math.pow(f(coefficients, powers, x), 2)

  def summation(upperLimit: Int,
                lowerLimit: Int,
                coefficients: List[Int],
                powers: List[Int]): Double = {
    val step = 0.001
    val subIntervals = lowerLimit.toDouble to upperLimit by step

    subIntervals
      .foldLeft(0.0) { case (acc, x) => acc + area(coefficients, powers, x) * step }
  }
}
