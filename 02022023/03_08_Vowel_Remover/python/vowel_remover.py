# https://www.codewars.com/kata/5547929140907378f9000039
# Level 8 kyu

# Directions
# Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

# Examples
# "hello"     -->  "hll"
# "codewars"  -->  "cdwrs"
# "goodbye"   -->  "gdby"
# "HELLO"     -->  "HELLO"
# don't worry about uppercase vowels
# y is not considered a vowel for this kata

# Function
def shortcut(string_for_removal):
    vowels: list = ["a", "e", "i", "o", "u"]
    answer: str = ''
    
    for character in string_for_removal:
        if character not in vowels:
            answer += character
    
    return answer


# Test Cases
test.assert_equals(shortcut('hello'),'hll')