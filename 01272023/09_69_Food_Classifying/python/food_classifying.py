from random import choice


food: list = choice(['apple','grape', 'bacon', 'steak', 'worm', 'dirt'])

if food == 'apple' or food == 'grape':
    print('fruit')
elif food == 'bacon' or food == 'steak':
    print('meat')
elif food == 'dirt' or food == 'worm':
    print('yuck')