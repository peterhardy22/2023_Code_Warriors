from random import randint


choice: int = randint(1,10)
print(f'{choice=}')

if choice == 7:
    print("lucky")
else:
    print("unlucky")