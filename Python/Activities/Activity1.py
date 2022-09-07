name = input("Enter your name: ")
age = int(input("Enter your age: "))

if age < 0 or age > 100:
    print("Enter age between 0 and 100")
elif age == 100:
    print("Congratulations! You have turned 100")
else:
    print( name + " will turn 100 in the year " + str(2022 + (100 - age)))