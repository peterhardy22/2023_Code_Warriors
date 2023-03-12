# https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
# Level 8 kyu

# Directions:
# I have a cat and a dog.
# I got them at the same time as kitten/puppy. That was humanYears years ago.
# Return their respective ages now as [humanYears,catYears,dogYears]

# NOTES:
# humanYears >= 1
# humanYears are whole numbers only

# Cat Years
# 15 cat years for first year
# +9 cat years for second year
# +4 cat years for each year after that

# Dog Years
# 15 dog years for first year
# +9 dog years for second year
# +5 dog years for each year after that

# Function
def human_years_cat_years_dog_years(human_years: int) -> list:
    if human_years == 1:
        return [1, 15, 15]
    elif human_years == 2:
        return [2, 24, 24]
    else:
        return [human_years, 24 + (4 * (human_years - 2)), 24 + (5 * (human_years - 2))]

# Test Cases
# import codewars_test as test
# from solution import human_years_cat_years_dog_years

# @test.describe("Fixed Tests")
# def fixed_tests():
#     @test.it("one")
#     def _():
#         test.assert_equals(human_years_cat_years_dog_years(1), [1,15,15])
#     @test.it("two")
#     def _():
#         test.assert_equals(human_years_cat_years_dog_years(2), [2,24,24])
#     @test.it("ten")
#     def _():
#         test.assert_equals(human_years_cat_years_dog_years(10), [10,56,64])