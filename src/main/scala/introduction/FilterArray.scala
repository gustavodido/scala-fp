package introduction

class FilterArray {
  def f(delim: Int, arr: List[Int]): List[Int] =
//    arr.filter(_ < delim)
//    arr match{
//      case head :: tail if head < delim => head +: f(delim,tail)
//      case head :: tail if head >= delim => f(delim,tail)
//      case Nil => Nil
//    }
    arr.flatMap(e => if (e < delim) Some(e) else None)
}
