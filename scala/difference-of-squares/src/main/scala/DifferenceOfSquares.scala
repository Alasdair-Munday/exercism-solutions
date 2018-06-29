import scala.math._

object DifferenceOfSquares {

  def sumOfSquares(n: Int, acc: Int = 0): Int =
    n match {
      case 0 => acc
      case _ => sumOfSquares(n - 1, acc + pow(n, 2).toInt)
    }

  def squareOfSum(n: Int, acc: Int = 0): Int =
    n match {
      case 0 => pow(acc, 2).toInt
      case _ => squareOfSum(n - 1, acc + n)
    }

  def differenceOfSquares(n: Int): Int =
    squareOfSum(n) - sumOfSquares(n)
}
