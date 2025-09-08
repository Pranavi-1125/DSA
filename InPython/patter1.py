
def pattern1(n):
    for i in range(n):
        for j in range(n):
            print("* ",end = '')  #Since in python,next print will print on the next line so by this end we are saying not go to the nest line
        print("\n")


t = int(input())
for i in range(t):
    n = int(input())
    pattern1(n)
