# https://www.codewars.com/kata/586e0dc9b98de0064b000247
# Level 7 kyu

# Directions:
# You're a statistics professor and the deadline for submitting your students' grades is tonight at midnight. 
# Each student's grade is determined by their mean score across all of the tests they took this semester.

# You've decided to automate grade calculation by writing a function calculate_grade() 
# that takes a list of test scores as an argument and returns a one character string representing the student's grade calculated as follows:

# 90% <= mean score <= 100%: "A",
# 80% <= mean score < 90%: "B",
# 70% <= mean score < 80%: "C",
# 60% <= mean score < 70%: "D",
# mean score < 60%: "F"
# For example, calculate_grade([92, 94, 99]) would return "A" since the mean score is 95.
# calculate_grade([50, 60, 70, 80, 90]) would return "C" since the mean score is 70.

# Your function should handle an input list of any length greater than zero.


# Function
def calculate_grade(scores: list) -> str:
    mean_score: float = sum(scores) / len(scores)
    
    if mean_score >= 90: 
        return "A"
    elif mean_score >= 80: 
        return "B"
    elif mean_score >= 70: 
        return "C"
    elif mean_score >= 60: 
        return "D"
    else: 
        return "F"

# Test Cases
import codewars_test as test
from solution import calculate_grade

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(calculate_grade([92, 94, 99]), "A")
        test.assert_equals(calculate_grade([50, 60, 70, 80, 90]), "C")
        test.assert_equals(calculate_grade([50, 55]), "F")