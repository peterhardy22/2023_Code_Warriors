# https://www.codewars.com/kata/563d59dd8e47a5ed220000ba
# Level 7 kyu

# Debug function getSumOfDigits that takes positive integer to calculate sum of its digits. 
# Assume that argument is an integer.

# Example
# 123  => 6
# 223  => 7
# 1337 => 14

# Function
def get_sum_of_digits(number: int) -> int:
    digits_list: list[str] = list(str(number))
    sum: int = 0
    for digit in digits_list:
        sum += int(digit)
    return sum

# Tests
# from solution import get_sum_of_digits
# import codewars_test as test

# @test.describe('Sum of digits')
# def tests():
#     @test.it('Basic tests')
#     def it1():
#         test.assert_equals(get_sum_of_digits(123), 6)