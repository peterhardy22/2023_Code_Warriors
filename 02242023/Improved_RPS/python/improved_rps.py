from random import randint


player_wins: int = 0
computer_wins: int = 0
winning_score: int = 0

while player_wins < winning_score and computer_wins < winning_score:
    print(f"Player Score: {player_wins} Computer Score: {computer_wins}")

    print("Rock...")
    print("Paper...")
    print("Scissors...")
    print("SHOOT!")

    player: str = input("Player, make your move: ").lower()
    random_number: int = randint(0,2)
    if random_number == 0:
        computer: str = "rock"
    elif random_number == 1:
        computer: str = "paper"
    else:
        computer: str = "scissors"

    print(f"Computer plays {computer}!")

    if player == computer:
        print("It's a tie!")
    elif player == "rock":
        if computer == "scissors":
            print("Player wins!")
            player_wins += 1
        else:
            print("Computer wins!")
            computer_wins += 1
    elif player == "paper":
        if computer == "rock":
            print("Player wins!")
            player_wins += 1
        else:
            print("Computer wins!")
            computer_wins += 1
    elif player == "scissors":
        if computer == "paper":
            print("Player wins!")
            player_wins += 1
        else:
            print("Computer wins!")	
            computer_wins += 1
    else:
        print("Please enter a valid move goof!")