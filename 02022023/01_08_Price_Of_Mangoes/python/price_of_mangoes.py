# https://www.codewars.com/kata/57a77726bb9944d000000b06
# Level 8 kyu

# Directions:
# There's a "3 for 2" (or "2+1" if you like) offer on mangoes.
# For a given quantity and price (per mango), calculate the total cost of the mangoes.

# Examples
# mango(2, 3) ==> 6    # 2 mangoes for $3 per unit = $6; no mango for free
# mango(3, 3) ==> 6    # 2 mangoes for $3 per unit = $6; +1 mango for free
# mango(5, 3) ==> 12   # 4 mangoes for $3 per unit = $12; +1 mango for free
# mango(9, 5) ==> 30   # 6 mangoes for $5 per unit = $30; +3 mangoes for free

# Function
def mango(quantity, price):
    if quantity % 3 == 0:
        free_mangoes: int = quantity / 3
        mangoes_to_buy: int = quantity - free_mangoes
        total: int = mangoes_to_buy * price
    elif quantity % 3 == 1:
        quantity -= 1
        free_mangoes: int = quantity / 3
        mangoes_to_buy: int = quantity - free_mangoes
        total: int = (mangoes_to_buy + 1) * price
    else:
        quantity -= 2
        free_mangoes: int = quantity / 3
        mangoes_to_buy: int = quantity - free_mangoes
        total: int = (mangoes_to_buy + 2) * price
    
    return total


# Test Cases
test.describe("Example Tests")

test.assert_equals(mango(3, 3), 6)
test.assert_equals(mango(9, 5), 30)
test.assert_equals(mango(10, 5), 35)
test.assert_equals(mango(11, 5), 40)