print("Stone paper scissor")

player1_name = input("Enter PLayer 1's name: ")
player2_name = input("Enter Player 2's name: ")

print("Select from stone, paper or scissor")

player1_choice = input("Player 1's choice: ")
player2_choice = input("Player 2's choice: ")

if player1_choice == player2_choice:
    print("Both have chosen the same choice, ", player1_choice, "\nTry again")
elif player1_choice == "stone":
    print("Player 1 wins")
elif player2_choice == "stone":
        print("Player 2 wins")
elif player1_choice == "scissor":
            print("Player 1 wins")      
else:
    print("Player 2 wins")
