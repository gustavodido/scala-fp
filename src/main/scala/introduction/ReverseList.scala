package introduction

class ReverseList {
  def f(list: List[Int]): List[Int] =
//    list.reverse
      list match{
        case head :: tail => f(tail) :+ head
        case Nil => Nil
      }

}
