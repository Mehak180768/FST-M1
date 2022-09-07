l = []

while (True):
    l.append(int(input("Enter a number")))

    yORn = input("Do you want to enter more number?(y/n): ")
    if yORn == 'n' or yORn == 'N':
        break

if l[0] == l[-1]:
    print(True)

else:
    print(False)    

