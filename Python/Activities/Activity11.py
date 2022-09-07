fruits = {"banana": 50, "apple": 100, "grapes": 100, "sapota": 100}

fruitToCheck = input("Enter name of a fruit: ").lower()

if fruits.get(fruitToCheck) == None:
    print("Fruit is not present in the list")
else:
    print("Fruit is present in the list")

