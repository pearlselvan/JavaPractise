"""http://www.geeksforgeeks.org/count-ways-reach-nth-stair/"""

def countways(n):
    # print "No of steps ", n
    if (n<=0):
        return 0
    elif(n==0) :
        return 1
    else:
        return countways(n-1) + countways(n-2) + countways(n-3)


print countways(5)
