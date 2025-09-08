# Takes t as input on how many patterns and takes t times output for printing
def pattern4(n):
    for i in range(1,n+1):
        for j in range(1,i+1):
            print(i," ",end = '')  #Since in python,next print will print on the next line so by this end we are saying not go to the nest line
        print("\n")


t = int(input())
for i in range(t):
    n = int(input())
    pattern4(n)
