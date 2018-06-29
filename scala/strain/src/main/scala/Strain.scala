object Strain {
  def keep[T] = loop[T] (discard = false) _

  def discard[T] = loop[T] (discard = true) _

  private def loop[T]
    (discard:Boolean, acc:Seq[T] = Seq())
    (list:Seq[T], predicate:T => Boolean):Seq[T] = {
      
    if(list == Seq()) return acc

    val h::t = list

    val newAcc = if (discard ^ predicate(h)) acc :+ h else acc

    loop(discard, newAcc)(t, predicate)
  }
}
