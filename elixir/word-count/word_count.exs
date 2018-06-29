defmodule Words do
  @doc """
  Count the number of words in the sentence.

  Words are compared case-insensitively.
  """
  @spec count(String.t) :: map
  def count(sentence) do
    String.replace(sentence, ~r/[^\-_A-Za-z\dö\s]+/, "")
      |> String.downcase()
      |> String.split(~r/[\s_]+/)
      |> Enum.reduce(%{}, fn(word, acc) ->
        count =  Map.get(acc, word, 0)
        Map.put(acc, word, count + 1)
      end)
  end
end
