# https://www.codewars.com/kata/55ca43fb05c5f2f97f0000fd
# Level 8 kyu

# Directions:
# Your collegue wrote an simple loop to list his favourite animals. 
# But there seems to be a minor mistake in the grammar, which prevents the program to work. Fix it! :)
# If you pass the list of your favourite animals to the function, you should get the list of the animals with orderings and newlines added.

# For example, passing in:
# animals = [ 'dog', 'cat', 'elephant' ]
# will result in
# list_animals(animals) == '1. dog\n2. cat\n3. elephant\n'

# Function
def list_animals(animals: list) -> str:
    """Takes in a list of animals and returns them as a formatted string."""
    animal_list: str = ""

    for index, animal in enumerate(animals):
        animal_list += str(index + 1) + ". " + animals[index] + "\n"
    
    return animal_list


# Test Cases
animals = [ 'dog', 'cat', 'elephant' ]
test.assert_equals(list_animals(animals), '1. dog\n2. cat\n3. elephant\n')