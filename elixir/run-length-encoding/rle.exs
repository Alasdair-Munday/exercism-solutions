defmodule RunLengthEncoder do
  @doc """
  Generates a string where consecutive elements are represented as a data value and count.
  "HORSE" => "1H1O1R1S1E"
  For this example, assume all input are strings, that are all uppercase letters.
  It should also be able to reconstruct the data into its original form.
  "1H1O1R1S1E" => "HORSE"
  """
  @spec encode(String.t) :: String.t
  def encode(string) do
    Regex.scan(~r/(\w)\1*/, string)
      |> Enum.map(fn([group, letter]) -> "#{String.length(group)}#{letter}" end)
      |> Enum.join
  end

  @spec decode(String.t) :: String.t
  def decode(string) do
    Regex.scan(~r/(\d+)(\D)/, string, capture: :all_but_first)
      |> Enum.map(fn([count, letter]) -> String.duplicate(letter, String.to_integer(count)) end)
      |> Enum.join
  end
end
