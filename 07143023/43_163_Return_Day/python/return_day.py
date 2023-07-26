def return_day(number: int) -> str or None:
    """Takes in a number 1-7 and returns the corresponding day of the week with day 1 starting with Sunday."""
    days: dict = {1: "Sunday", 2: "Monday",
            3: "Tuesday", 4: "Wednesday",
            5: "Thursday", 6: "Friday",
            7: "Saturday"}
    
    if number < 8 or number > 0:
        print(days.get(number))


return_day(1) # "Sunday"
return_day(2) # "Monday"
return_day(3) # "Tuesday"
return_day(4) # "Wednesday"
return_day(5) # "Thursday"
return_day(6) # "Friday"
return_day(7) # "Saturday"
return_day(41) # None
