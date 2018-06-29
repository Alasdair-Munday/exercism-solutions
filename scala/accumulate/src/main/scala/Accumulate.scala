class Accumulate {
  def accumulate[A, B](f: (A) => B, list : List[A]): List[B] =
    list.length match {
      case 0 => List[B]()
      case _ => loop[A, B](f,list)
    }

  private def loop[A, B](f: (A) => B, list : List[A], acc: List[B] = List[B]()): List[B] = {
    val h::t = list
    val nextAcc = acc :+ f(h)

    t.length match {
      case 0 => nextAcc
      case _ => loop(f, t, nextAcc)
    }

  }
}
