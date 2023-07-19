# https://www.codewars.com/kata/5844a422cbd2279a0c000281
# Level 7 kyu

# Should be easy, begin by looking at the code. 
# Debug the code and the functions should work.
# There are three functions: Multiplication (x) Addition (+) and Reverse (!esreveR)

# Function
def multi(numbers_list: list[int]) -> int:
    """Takes in a list of integers and returns the multipled total."""
    if not numbers_list: return 0

    total: int = 1
    for number in numbers_list:
        total *= number

    return total


def add(numbers_list: list[int]) -> int:
    """Takes in a list of integers and returns the sum of all integers."""
    return sum(numbers_list)


def reverse(input_string: str) -> str:
    """Takes in a string and returns the string reversed."""
    return input_string[::-1]

# Tests
# test.assert_equals(multi([8,2,5]),80)
# test.assert_equals(add([1,15,3]),19)
# test.assert_equals(add([7,8,6,5,4,9]),39)
# test.assert_equals(reverse("Hello World"),"dlroW olleH")