object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    (1 to limit - 1).filter(index => {
      factors.exists(x => { (index % x) == 0 })
    }).sum
  }
}
