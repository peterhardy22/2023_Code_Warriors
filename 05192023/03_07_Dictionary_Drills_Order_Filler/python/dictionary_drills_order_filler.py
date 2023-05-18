# https://www.codewars.com/kata/586ee462d0982081bf001f07
# Level 8 kyu

# Directions:
# You're running an online business and a big part of your day is fulfilling orders. 
# As your volume picks up that's been taking more of your time, 
# and unfortunately lately you've been running into situations where you take an order but can't fulfill it.

# You've decided to write a function fillable() that takes three arguments: 
#   a dictionary stock representing all the merchandise you have in stock, 
#   a string merch representing the thing your customer wants to buy, 
#   and an integer n representing the number of units of merch they would like to buy. 
# Your function should return True if you have the merchandise in stock to complete the sale, 
# otherwise it should return False.

# Valid data will always be passed in and n will always be >= 1.


# Function
def fillable(stock: dict[str, int], merch: str, merch_units: int) -> bool:
    """Returns True if the merch and merch_units requested are available within stock."""
    return stock.get(merch, 0) >= merch_units


# Test Cases
import codewars_test as test
from solution import *

@test.describe("Sample tests")
def tests():
    @test.it("Some examples")
    def tests():
        stock = {
            'football': 4,
            'boardgame': 10,
            'leggos': 1,
            'doll': 5 }
        test.assert_equals(fillable(stock, 'football', 3), True)
        test.assert_equals(fillable(stock, 'leggos', 2), False)
        test.assert_equals(fillable(stock, 'action figure', 1), False)