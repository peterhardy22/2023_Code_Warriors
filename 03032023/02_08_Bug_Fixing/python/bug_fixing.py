# https://www.codewars.com/kata/55c28f7304e3eaebef0000da
# Level 8 kyu

# Directions:
# Unfinished Loop - Bug Fixing #1
# Oh no, Timmy's created an infinite loop! Help Timmy find and fix the bug in his unfinished for loop!

# Function
def create_array(number: int) -> list:
    result_list: list = []
    iterator: int = 1
    
    while iterator <= number: 
        result_list += [iterator]
        iterator += 1
    
    return result_list


# Test Cases
import codewars_test as test
from solution import create_array

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(create_array(1),[1])
        test.assert_equals(create_array(2),[1,2])
        test.assert_equals(create_array(3),[1,2,3])
        test.assert_equals(create_array(4),[1,2,3,4])
        test.assert_equals(create_array(5),[1,2,3,4,5])
        test.assert_equals(create_array(6),[1,2,3,4,5,6])
        test.assert_equals(create_array(7),[1,2,3,4,5,6,7])
        test.assert_equals(create_array(8),[1,2,3,4,5,6,7,8])
        test.assert_equals(create_array(9),[1,2,3,4,5,6,7,8,9])
        test.assert_equals(create_array(10),[1,2,3,4,5,6,7,8,9,10])