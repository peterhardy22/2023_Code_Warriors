# https://www.codewars.com/kata/57f780909f7e8e3183000078
# Level 8 kyu

# Directions:
# Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
# [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

# Function
def grow(numbers_list: list) -> int:
    answer: int = 1
    for number in numbers_list:
        answer *= number
    return answer


# Test Cases
# import codewars_test as test
# from solution import grow

# @test.describe("Fixed Tests")
# def fixed_tests():
#     @test.it('Basic Test Cases')
#     def basic_test_cases():
#         tests = [
#             [6 , [1, 2, 3]],
#             [16, [4, 1, 1, 1, 4]],
#             [64, [2, 2, 2, 2, 2, 2]],
#         ]
        
#         for exp, inp in tests:
#             test.assert_equals(grow(inp), exp)