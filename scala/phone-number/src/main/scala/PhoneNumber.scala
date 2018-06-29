object PhoneNumber {
  private val validNum = """^1?[2-9]\d{2}[2-9]\d{6}$""".r

  def clean(number:String):Option[String] = {
    val cleanNumber = number.filter(('0' to '9') contains _)
    cleanNumber match {
      case validNum() => Some(cleanNumber takeRight 10)
      case _ => None
    }
  }
}
