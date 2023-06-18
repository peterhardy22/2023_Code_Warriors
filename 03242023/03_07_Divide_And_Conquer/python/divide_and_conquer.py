# https://www.codewars.com/kata/57eaec5608fed543d6000021
# Level 7 kyu

# Directions:
# Given a mixed array of number and string representations of integers, 
# add up the non-string integers and subtract the total of the string integers.
# Return as a number.

# Function
def div_con(input_list: list) -> int:
    str_count, int_count: int = 0, 0
    
    for input in input_list:
        if isinstance(input, str):
            str_count += int(input)
        else:
            int_count += input
    
    return int_count - str_count


# Test Cases
# import codewars_test as test
# from solution import div_con

# @test.describe("Fixed Tests")
# def fixed_tests():
#     @test.it('Basic Test Cases')
#     def basic_test_cases():
#         test.assert_equals(div_con([9, 3, '7', '3']), 2)
#         test.assert_equals(div_con(['5', '0', 9, 3, 2, 1, '9', 6, 7]), 14)
#         test.assert_equals(div_con(['3', 6, 6, 0, '5', 8, 5, '6', 2,'0']), 13) 
#         test.assert_equals(div_con(['1', '5', '8', 8, 9, 9, 2, '3']), 11)
#         test.assert_equals(div_con([8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7]), 61)
