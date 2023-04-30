donations: dict[str, float] = dict(sam=25.0, lena=88.99, chuck=13.0, linus=99.5, stan=150.0, lisa=50.25, harrison=10.0)

# Use a loop to add together all the donations.
# Store the resulting number in a variable called total_donations.
total_donations: float = sum(donations.values())

print(total_donations)