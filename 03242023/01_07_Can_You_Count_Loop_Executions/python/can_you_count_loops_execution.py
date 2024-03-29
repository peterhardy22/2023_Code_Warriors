# https://www.codewars.com/kata/633bbba75882f6004f9dae4c
# Level 7 kyu

# Directions:
# As a programmer, one must be familiar with the usage of iterative statements in coding implementations! 
# Depending on the chosen programming language, iterative statements can come in the form of for, while, do-while etc.
# Below is an example of a nested C-style for-loop:

# for(int i = 0; i < A; i++){ 
#   // some statements
#   for(int j = 0; j < B; j++){
#     // some statements
#     for(int k = 0; k < C; k++){
#       // some statements
#     }
#   }
# }
# Where A, B and C are natural numbers.

# Task
# Given an array of length N, where N denotes the number of iterative statements. 
# Each item-pair in the array represents two elements, with the 1st value (V) indicating the upper boundary for the iteration to take place
# (can be inclusive or exclusive depending on the 2nd value) and the 2nd value (Boolean data type -> true / false depending on your chosen language) 
# indicating whether the upper boundary (V) is inclusive or not.

# You must write a function that outputs an array in which each element represents the number of times each for-loop condition is evaluated. Below is an example for better understanding:

# Example
# arr = [[7, true], [5, false]]

# for(int i = 0; i <= 7; i++){   // This statement is executed 9 times before termination -> 0, 1, 2, 3, 4, 5, 6, 7, 8 (since 8 > 7 is the breaking condition)
#   for(int j = 0; j < 5; j++){  // In one cycle of outermost loop, this statement is executed 6 times before termination -> 0, 1, 2, 3, 4, 5 (since 5 >= 5 is the breaking condition)
#     // some statements
#   }
# }

# Note
# The array can be empty, with a range of 0 <= N <= 20
# The starting counter of the C-style for-loop is always 0
# The iteration expression or operation to be performed is always incremental
# The range of upper boundary is as follows: 1 <= V <= 20

# Function
def count_loop_iterations(arr: list) -> list:
    if arr == []: return []
        
    math_list: list = []
    
    for argument in arr:
        if argument[1]:
            limit: int = argument[0] + 2
            range_end: int = limit - 1
        else:
            limit: int = argument[0] + 1
            range_end: int = argument[0]
        math_list.append((limit, range_end))
    
    if len(math_list) == 1:
        return [limit]
    
    answer_list: list = []
    
    for index, (key, value) in enumerate(math_list):
        if index > 0:
            first_number: int = math_list[index][0]
            second_number: int = int((answer_list[index-1] / math_list[index-1][0]) * math_list[index-1][1])
            answer_list.append(first_number * second_number)
        else:
            answer_list.append(key)         

    return answer_list


# Test Cases
# import codewars_test as test
# from solution import count_loop_iterations

# @test.describe("Can you count loop's iteration?")
# def test_group():
#     @test.it("Sample tests")
#     def test_case():
#         test.assert_equals(count_loop_iterations([(4, True), (5, False), (3, True)]), [6, 30, 125])
#         test.assert_equals(count_loop_iterations([(16, False), (11, False), (1, True), (3, False), (8, True), (10, True), (9, False), (11, True), (20, True), (3, False), (7, False)]), [17, 192, 528, 1408, 10560, 114048, 1045440, 12231648, 248396544, 948423168, 5690539008])
#         test.assert_equals(count_loop_iterations([]), [])
#         test.assert_equals(count_loop_iterations([(20, False)]), [21])