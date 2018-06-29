import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit;

object Gigasecond {
  def addGigaseconds(startDate: LocalDate): LocalDateTime =
    addGigaseconds(startDate.atStartOfDay)


  def addGigaseconds(startDateTime: LocalDateTime): LocalDateTime = 
    startDateTime.plusSeconds(1000000000)

}
