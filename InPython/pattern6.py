# Takes t as input on how many patterns and takes t times output for printing
def pattern6(n):
    for i in range(n+1,0,-1):
        for j in range(1,i):
            print(j," ",end = '')  #Since in python,next print will print on the next line so by this end we are saying not go to the nest line
        print("\n")


t = int(input())
for i in range(t):
    n = int(input())
    pattern6(n)
