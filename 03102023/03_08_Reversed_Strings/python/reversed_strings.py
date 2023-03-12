# https://www.codewars.com/kata/5168bb5dfe9a00b126000018
# Level 8 kyu

# Directions:
# Complete the solution so that it reverses the string passed into it.
# 'world'  =>  'dlrow'
# 'word'   =>  'drow'

# Function
def solution(string: str) -> str:
    return string[::-1]

# Test Cases
# import codewars_test as test
# from solution import solution

# @test.describe("Fixed Tests")
# def basic_tests():
#     @test.it('Basic Test Cases')
#     def basic_test_cases():
#         test.assert_equals(solution('world'), 'dlrow')
#         test.assert_equals(solution('hello'), 'olleh')
#         test.assert_equals(solution(''), '')
#         test.assert_equals(solution('h'), 'h')