# https://www.codewars.com/kata/5848cd33c3689be0dc00175c
# Level 7 kyu

# Help Johnny!
# He can't make his code work!
# Johnny is trying to make a function that encodes 2 strings into their ASCII values and sum them together, 
# but he can't find the error in his code! Help him!

# Function
def add(string_one: str, string_two: str) -> int:
    """Converts arguments to ASCII values and sums them together."""
    string_one: bytes = string_one.encode()
    string_two: bytes = string_two.encode()
    return sum(string_one + string_two)

# Tests
# test.assert_equals(add('a', 'b'), 195)
# test.assert_equals(add('aa', 'bb'), 390)