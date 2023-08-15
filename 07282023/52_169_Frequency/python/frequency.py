from typing import Union

def frequency(collection: list, value: Union[int, float, bool, str]) -> Union[int, float, bool, str]:
    """This function accepts a list and a search_term and 
    returns the number of times the search_term appears in the list."""

    return collection.count(value)


print(frequency([1,2,3,4,4,4], 4)) # 3
print(frequency([True, False, True, True], False)) # 1
