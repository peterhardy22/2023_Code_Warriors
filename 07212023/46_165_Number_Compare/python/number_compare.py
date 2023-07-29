def number_compare(a: int, b: int) -> str:
    """Do a numbers comparison and return which number is greater or are they equal."""
    if a == b:
        return "Numbers are equal"
    elif a > b:
        return "First is greater"
    return "Second is greater"

print(number_compare.__doc__)
print(number_compare(1,1)) # "Numbers are equal"
print(number_compare(1,0)) # "First is greater"
print(number_compare(2,4)) # "Second is greater"