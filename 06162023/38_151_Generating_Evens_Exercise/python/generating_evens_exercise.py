#Define a function called generate_evens
#It should return a list of even numbers between 1 and 50(not including 50)
def generate_evens():
    answer = []

    for number in range(1, 50):
        if number % 2 == 0:
            answer.append(number)
    
    return answer