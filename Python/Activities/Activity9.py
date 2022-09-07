def enterList():
    l = []
    while True:
        l.append(int(input("Enter a number: ")))

        yORn = input("Do you want to enter more numbers? (y/n): ")
        if yORn == 'n' or yORn == 'N':
            break
     
    return l   

print("Enter numbers for first list-")
l1 = enterList()

print("Enter numbers for second list-")
l2 = enterList()

l3 = []

for i in l1:
    if i % 2 != 0:
        l3.append(i)

for i in l2:
    if i % 2 == 0:
        l3.append(i)

print("First List: ", l1)
print("Second List: ", l2)
print("List from odd numbers in the first list and even numbers in the second list: ", l3)        