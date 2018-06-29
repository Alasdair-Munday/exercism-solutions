case class SpaceAge(val seconds: Double) {
  val onEarth: Double = getAgeInYears(1)
  val onMercury: Double = getAgeInYears(0.2408467)
  val onVenus: Double = getAgeInYears(0.61519726)
  val onMars: Double = getAgeInYears(1.8808158)
  val onJupiter: Double = getAgeInYears(11.862615)
  val onSaturn: Double = getAgeInYears(29.447498)
  val onUranus: Double = getAgeInYears(84.016846)
  val onNeptune: Double = getAgeInYears(164.79132)

  private def getAgeInYears(earthRatio: Double) = {
    val yearInSeconds = 31557600 * earthRatio
    val years = seconds / yearInSeconds

    BigDecimal(years)
    .setScale(2, BigDecimal.RoundingMode.HALF_UP)
    .toDouble
  }

}
