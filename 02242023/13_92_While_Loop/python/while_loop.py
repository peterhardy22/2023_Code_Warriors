from random import randint  


number: int = randint(1, 10)

while number != 5:
    print(number)
    number: int = randint(1, 10)

print(number)