import scala.collection.immutable.SortedMap

class School {
  type DB = Map[Int, Seq[String]]

  private var _db = SortedMap[Int, Seq[String]]()
    .withDefaultValue(Seq())

  def add(name: String, g: Int) =
    _db += (g -> (grade(g) :+ name))

  def db: DB = _db

  def grade(g: Int): Seq[String] = _db(g)

  def sorted: DB = _db.mapValues(_.sorted)
}
