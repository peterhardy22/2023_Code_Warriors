from keyword import iskeyword

def contains_keyword(*args: any) -> bool:
    for arg in args:
        if iskeyword(arg): return True
    return False


print(contains_keyword("hello", "goodbye"))  #False
print(contains_keyword("def", "haha", "lol", "chicken", "alaska"))  #True
print(contains_keyword("four", "for", "if"))  #True
print(contains_keyword("blah", "doggo", "crab", "anchor"))  #False
print(contains_keyword("grizzly", "ignore", "return", "False"))  #True