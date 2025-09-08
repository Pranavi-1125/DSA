# Takes t as input on how many patterns and takes t times output for printing
def pattern2(n):
    for i in range(n):
        for j in range(i+1):
            print("* ",end = '')  #Since in python,next print will print on the next line so by this end we are saying not go to the nest line
        print("\n")


t = int(input())
for i in range(t):
    n = int(input())
    pattern2(n)
