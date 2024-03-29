# https://www.codewars.com/kata/56368f37d464c0a43c00007f
# Level 7 kyu

# Debug a function called calculate that takes 3 values. 
# The first and third values are numbers. 
# The second value is a character. 
# If the character is "+" , "-", "*", or "/", 
# the function will return the result of the corresponding mathematical function on the two numbers. 
# If the string is not one of the specified characters, the function should return null.

# calculate(2,"+", 4); //Should return 6
# calculate(6,"-", 1.5); //Should return 4.5
# calculate(-4,"*", 8); //Should return -32
# calculate(49,"/", -7); //Should return -7
# calculate(8,"m", 2); //Should return null
# calculate(4,"/",0) //should return null

# Function
def calculate(a: int, o: str, b: int) -> int:
    """Basic calculator that takes in 2 numbers and an operator for adding, subtracting, multiplying and dividing numbers."""
    result: int = 0
     
    if o == "+":
        return a + b
    elif o == "-":
        return a - b
    elif o == "/" and b != 0:
        return a / b
    elif o == "*":
        return a * b
    return None

# Tests
def assert_equals(func, answer):
    func_output = func
    if func_output == answer:
        return True
    return False

print(assert_equals(calculate(6,"-", 1.5), 4.5))
print(assert_equals(calculate(-4,"*", 8), -32))
print(assert_equals(calculate(49,"/", -7), -7))
print(assert_equals(calculate(8,"m", 2), None))
print(assert_equals(calculate(4,"/",0), None))
print(assert_equals(calculate(10,"+",11), 3))