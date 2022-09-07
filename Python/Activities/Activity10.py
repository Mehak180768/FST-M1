tup = tuple(input("Enter a sequence of numbers seperated by comma: ").split(", "))
hasMultiple = False

for i in tup:
    if int(i) % 5 == 0:
        print(i)
        hasMultiple = True

if hasMultiple == False:
    print("There are no multiples of 5 in this sequence")