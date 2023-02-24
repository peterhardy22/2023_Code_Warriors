# Add up all odd numbers between 10 and 20.

# Store the result in x:
x: int = 0

# YOUR CODE GOES HERE:
numbers: list = range(11, 20, 2)

for number in numbers:
    x += number

print(x)