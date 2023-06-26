# https://www.codewars.com/kata/53da6a7e112bd15cbc000012
# Level 8 kyu

# Directions:
# Python dictionaries are inherently unsorted. 
# So what do you do if you need to sort the contents of a dictionary?
# Create a function that returns a sorted list of (key, value) tuples (Javascript: arrays of 2 items).
# The list must be sorted by the value and be sorted largest to smallest.

# Examples
# sort_dict({3:1, 2:2, 1:3}) == [(1,3), (2,2), (3,1)]
# sort_dict({1:2, 2:4, 3:6}) == [(3,6), (2,4), (1,2)]


# Function
from operator import itemgetter

def sort_dict(input: dict[int, int]) -> list[tuple[int, int]]:
    """Returns a list of tuples from largest to smallest based on the key of the input dictionary."""
    return sorted(input.items(), key=itemgetter(1), reverse=True)


# Test Cases
test.assert_equals(sort_dict({3:1, 2:2, 1:3}), [(1,3), (2,2), (3,1)])
test.assert_equals(sort_dict({1:2, 2:4, 3:6}), [(3,6), (2,4), (1,2)])
test.assert_equals(sort_dict({1:5, 3:10, 2:2, 6:3, 8:8}), [(3,10), (8,8), (1,5), (6,3), (2,2)])