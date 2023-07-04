# https://www.codewars.com/kata/5a21e090f28b824def00013c
# Level 7 kyu

# In this kata, you will take the keys and values of a dict and swap them around.
# You will be given a dictionary, and then you will want to return a dictionary with the old values as the keys, 
# and list the old keys as values under their original keys.

# For example, given the dictionary: 
    # {'Ice': 'Cream', 'Age': '21', 'Light': 'Cream', 'Double': 'Cream'}
# Should return: 
    # {'Cream': ['Ice', 'Double', 'Light'], '21': ['Age']}

# Notes:
# The dictionary given will only contain strings
# The dictionary given will not be empty
# You do not have to sort the items in the lists

# Function
def switch_dict(before_dict: dict[str, list[str]]) -> dict[str, list[str]]:
    """Takes in a dictionary and switches the key and values for the return dictionary."""
    after_dict: dict[str, list[str]] = {dict[key]: [key] for key in dict}

    for key, value in dict.items():
        if value in after_dict.keys() and key not in after_dict[value]:
            after_dict[value].append(key)
    
    return after_dict

# Tests
# before = {
#           'Ice': 'Cream',
#           'Age': '21',
#           'Light': 'Cream',
#           'Double': 'Cream'
#           }

# expected_ans = {
#                 'Cream': ['Ice', 'Double', 'Light'],
#                 '21': ['Age']
#                 }

# usr_ans = switch_dict(before)

# # Sort lists inside dict
# usr_ans = {k: sorted(usr_ans[k]) for k in usr_ans}
# expected_ans = {k: sorted(expected_ans[k]) for k in expected_ans}

# test.describe('Basic tests')
# test.it('Sample case')
# test.assert_equals(usr_ans, expected_ans)