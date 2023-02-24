from random import randint  

# use randint(a, b) to generate a random number between a and b

number: list = randint(1, 10)
i = 0

while number != 5:
    i = randint(1, 10)
    number += 1
