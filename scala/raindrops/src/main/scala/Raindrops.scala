object Raindrops {
  private def genericNoise(noise:String, factor:Int)(n:Int):String =
    n % factor match {
      case 0 => noise
      case _ => ""
    }
    
  private val noises = Seq(
    genericNoise("Pling", 3) _ ,
    genericNoise("Plang", 5) _ ,
    genericNoise("Plong", 7) _
  )

  def convert(n: Int): String =
    noises.foldLeft("")((noise:String, makeNoise:Int => String) => noise + makeNoise(n))
    match {
      case "" => n.toString
      case x => x
    }
}
