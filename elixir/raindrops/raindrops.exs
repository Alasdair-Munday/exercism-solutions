defmodule Raindrops do
  @doc """
  Returns a string based on raindrop factors.

  - If the number contains 3 as a prime factor, output 'Pling'.
  - If the number contains 5 as a prime factor, output 'Plang'.
  - If the number contains 7 as a prime factor, output 'Plong'.
  - If the number does not contain 3, 5, or 7 as a prime factor,
    just pass the number's digits straight through.
  """
  @factors [
    {3, "Pling"},
    {5, "Plang"},
    {7, "Plong"}
  ]

  @spec convert(pos_integer) :: String.t
  def convert(number) do
    result = Enum.reduce(@factors, "", fn {factor, word}, acc ->
      case rem(number, factor) do
        0 -> acc <> word
        _ -> acc
      end
    end)

    case result do
      "" -> Integer.to_string(number)
      _ -> result
    end
  end
end
