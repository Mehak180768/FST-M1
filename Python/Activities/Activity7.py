l = []

while (True):
    l.append(int(input("Enter a number: ")))
    yORn = input("Do you want to enter more?(y/n): ")

    if yORn == 'n' or yORn == 'N':
        break


print("Total of all the numbers in the list: ", sum(l))