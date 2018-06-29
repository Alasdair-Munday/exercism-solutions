import scala.util.Random

object Robot {
  var currentNameIndex = 0

  val letters = Stream.range('A','[')
  val numbers = Stream.range('0',':')

  private var names = for {
    letter1 <- letters
    letter2 <- letters
    number1 <- numbers
    number2 <- numbers
    number3 <- numbers
  } yield s"${letter2}${letter1}${number3}${number2}${number1}"

  def getNewName = takeNextName(names)

  private def takeNextName(nameStream:Stream[String]) = {
    val newName #:: tail = nameStream
    names = tail
    newName
  }
}

class Robot {
  val rand = new Random
  var name = Robot.getNewName

  def reset() = {
    name = Robot.getNewName
  }
}
