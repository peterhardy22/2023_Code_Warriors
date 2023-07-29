def single_letter_count(input_string: str, letter: str) -> int:
    """Takes in a word and a letter and return the count that letter appears in the word."""
    return input_string.lower().count(letter.lower())


print(single_letter_count.__doc__)
print(single_letter_count("Hello World", "h")) # 1
print(single_letter_count("Hello World", "z")) # 0
print(single_letter_count("HelLo World", "l")) # 3
