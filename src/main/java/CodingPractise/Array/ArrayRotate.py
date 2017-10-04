mylist=[1,2,3,4,5]

'''
[1, 2, 3, 4, 5, 6, 7]  , 2 rotation => [3, 4, 5, 6, 7, 1, 2]

'''

# syntax : print mylist[index:index-1]
n=len(mylist)
def rotate():
    print "length",n
    # print mylist[3:]+mylist[:2]
    #print mylist[1:3]
    # print mylist[::-1]
    # print mylist[::-2]
    # print mylist[1::2]
    # print mylist[2:]+mylist[:3]
    # print mylist[::3]
    print mylist[1:] # will print except 1st item from beginning
    print mylist[:1] #
    print mylist[2:] # will print except 2nd item from beginning
    print mylist[:2]
    print mylist[2:] # Extraction form 4 to 7 , index -1






def rotateworking(l, n):
    print "F",l[n:]
    print "S",l[:n]
    return l[n:] + l[:n]


if __name__ == '__main__':
    rotate()
    #print rotateworking(mylist,2)
