def return_day(number: int) -> str or None:
    """Takes in a number 1-7 and returns the corresponding day of the week with day 1 starting with Sunday."""
    days: dict = {1: "Sunday", 2: "Monday",
            3: "Tuesday", 4: "Wednesday",
            5: "Thursday", 6: "Friday",
            7: "Saturday"}
    
    if number <= 7 and number >= 1:
        return days.get(number)
    
    return None


print(return_day(1)) # "Sunday"
print(return_day(2)) # "Monday"
print(return_day(3)) # "Tuesday"
print(return_day(4)) # "Wednesday"
print(return_day(5)) # "Thursday"
print(return_day(6)) # "Friday"
print(return_day(7)) # "Saturday"
print(return_day(41)) # None
