n = int(input("Enter a number to get its multiples from 1 - 10- "))

for i in range(1, 11):
    print ("{0} x {1} = {2}".format(n, i, n * i))