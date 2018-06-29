object Pangrams {
  def isPangram(input: String): Boolean =
    ('a' to 'z').filter(!input.toLowerCase.contains(_)).isEmpty
}
