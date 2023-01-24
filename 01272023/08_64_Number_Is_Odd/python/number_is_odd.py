from random import randint


random_number: int = randint(1, 1000) 

if random_number % 2 == 0:
    print("even")
else:
    print("odd")