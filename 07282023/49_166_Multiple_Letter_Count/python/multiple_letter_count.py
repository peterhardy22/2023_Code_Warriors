def multiple_letter_count(word: str) -> dict[str, int]:
    return {char: word.count(char) for char in word}


print(multiple_letter_count("awesome")) # {'a': 1, 'e': 2, 'm': 1, 'o': 1, 's': 1, 'w': 1}
