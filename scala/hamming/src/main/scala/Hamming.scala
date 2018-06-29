object Hamming {
  def distance(a:String, b:String):Option[Int] =
    a.length == b.length match {
      case true => Some(a.zip(b).count(n => n._1 != n._2))
      case false => None
    }
}
