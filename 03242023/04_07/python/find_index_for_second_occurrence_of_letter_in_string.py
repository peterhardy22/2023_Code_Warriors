# https://www.codewars.com/kata/63f96036b15a210058300ca9
# Level 7 kyu

# Directions:
# In this kata, you need to write a function that takes a string and a letter as input, 
# then returns the index of the second occurrence of that letter in the string. 
# If there is no such letter in the string, then the function should return -1. 
# If the letter occurs only once in the string, then -1 should also be returned.

# Examples:
# second_symbol('Hello world!!!','l') --> 3
# second_symbol('Hello world!!!', 'A') --> -1


# Function
def second_symbol(string: str, symbol: str) -> int:
    letter_list: list = []
    
    for index, char in enumerate(string):
        if char == symbol and char not in letter_list:
            letter_list.append(char)
        elif char in letter_list:
            return index
        
    return -1


# Test Cases
# import codewars_test as test
# from solution import second_symbol

# @test.describe("Fixed Tests")
# def fixed_tests():
#     @test.it("Basic Test Cases")
#     def basic_test_cases():
#         test.assert_equals(second_symbol('Hello world!!!','l'), 3, 'Find the index of the second symbol "l" in the string')
#         test.assert_equals(second_symbol('Hello world!!!', 'o'), 7, 'Find the index of the second symbol "o" in the string')
#         test.assert_equals(second_symbol('Hello world!!!', 'A'), -1, 'The symbol "A" is not in the string')
#         test.assert_equals(second_symbol('', 'q'), -1, 'The symbol "q" is not in the string')
#         test.assert_equals(second_symbol('Hello', '!'), -1, 'The symbol "!" is not in the string')
