print("Stone paper scissor")

player1_name = input("Enter PLayer 1's name: ")
player2_name = input("Enter Player 2's name: ")

shouldPlayAgain = True

while(shouldPlayAgain == True):
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

 answer = input("Do you want to play another round? (Y/N) ")

 if answer == 'y' or answer == 'Y' or answer == 'yes' or answer == 'YES':
     shouldPlayAgain = True
 elif answer == 'n' or answer == 'N' or answer == 'no' or answer == 'NO':
     shouldPlayAgain = False
 else:
     print("Enter correct choice.")
     break

       
