defmodule Acronym do
  @doc """
  Generate an acronym from a string.
  "This is a string" => "TIAS"
  """
  @spec abbreviate(String.t()) :: String.t()
  def abbreviate(string) do
    String.split(string, ~r/(?=[A-Z])|\s/)
    |> Enum.reduce("", fn word, acc ->
      acc <> String.first(word) |> String.upcase
    end)
  end
end
