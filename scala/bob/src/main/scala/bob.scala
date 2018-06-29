class Bob {
  def hey(string:String):String = {

    val upper = string.toUpperCase
    val lower = string.toLowerCase
    val question = """.*\?""".r
    val silence = """^\s*$""".r
    
    string match {
      case string if string.equals(upper) && !string.equals(lower) => "Whoa, chill out!"
      case question(_*) => "Sure."
      case silence(_*) => "Fine. Be that way!"
      case _ => "Whatever."
    }
  }
}
