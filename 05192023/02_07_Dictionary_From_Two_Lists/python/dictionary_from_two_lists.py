# https://www.codewars.com/kata/5533c2a50c4fea6832000101
# Level 7 kyu

# Directions:
# There are two lists, possibly of different lengths. 
# The first one consists of keys, the second one consists of values. 
# Write a function createDict(keys, values) that returns a dictionary created from keys and values. 
# If there are not enough values, the rest of keys should have a None (JS null)value. 
# If there not enough keys, just ignore the rest of values.

# Example 1:
# keys = ['a', 'b', 'c', 'd']
# values = [1, 2, 3]
# createDict(keys, values) # returns {'a': 1, 'b': 2, 'c': 3, 'd': None}

# Example 2:
# keys = ['a', 'b', 'c']
# values = [1, 2, 3, 4]
# createDict(keys, values) # returns {'a': 1, 'b': 2, 'c': 3}


# Function
def create_dict(keys: list[str], values: list[int]) -> dict[str, int]:
    """Takes in a keys list and a values list then returns both lists combined into a dictionary."""
    answer: dict = {}
    for index in range(len(keys)):
        if index < len(values):
            answer[keys[index]] = values[index]
        else:
            answer[keys[index]] = None
    return answer


# Test Cases
from solution import create_dict
import codewars_test as test

@test.describe("Basic tests")
def test_group():
    
    # Add your tests on specified format:
    # i: ((inp_keys, inp_values), expected)
    tests = {
        0: ((['a', 'b', 'c', 'd'], [1, 2, 3]),{'a': 1, 'b': 2, 'c': 3, 'd': None}),
        1: ((['a', 'b', 'c'], [1, 2, 3, 4]),{'a': 1, 'b': 2, 'c': 3})
    }
    for _, value in tests.items():
        @test.it(f"Testing for keys = {value[0][0]}, values= {value[0][1]}, expected = {value[1]}")
        def test_case():
            test.assert_equals(create_dict(value[0][0], value[0][1]), value[1], f"Didnt work for  keys = {value[0][0]}, values= {value[0][1]}")
