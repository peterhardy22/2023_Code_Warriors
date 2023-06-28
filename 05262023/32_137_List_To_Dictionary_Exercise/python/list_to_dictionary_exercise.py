person: list = [["name", "Jared"], ["job", "Musician"], ["city", "Bern"]]

# use the person variable in your answer
answer: dict = {person[index][0]: person[index][1] for index in range(0,3)}