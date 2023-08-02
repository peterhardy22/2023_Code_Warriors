def list_manipulation(a_list: list, command: str, location: str, value=None):
    """Takes in commands and a list and returns modified list depending on command."""
    if (command=="remove" and location=="end"):
        return a_list.pop()
    elif (command=="remove" and location=="beginning"):
        return a_list.pop(0)
    elif (command=="add" and location=="beginning"):
        a_list.insert(0, value)
    elif (command=="add" and location=="end"):
        a_list.append(value)
    return a_list


print(list_manipulation([1,2,3], "remove", "end")) # 3
print(list_manipulation([1,2,3], "remove", "beginning")) #  1
print(list_manipulation([1,2,3], "add", "beginning", 20)) #  [20,1,2,3]
print(list_manipulation([1,2,3], "add", "end", 30)) #  [1,2,3,30]