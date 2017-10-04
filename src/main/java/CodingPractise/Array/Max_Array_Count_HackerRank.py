def birthdayCakeCandles(n, ar):
    # Complete this function
    max = 0
    count = 0
    for ele in ar:
        if ele >= max:
            max = ele
            count = count+1
    return count

if __name__ == '__main__':
    # data=[3, 2, 1, 3]
    data=[18, 90 ,90 ,13, 90, 75 ,90 ,8 ,90 ,43]
    n=4;
    print "Max " , birthdayCakeCandles(3,data)


