mylst=[1,2,3,4,0,1,5,4,3,2,1]
# mylst=[1,2,13,4]

def peakElement(lst,low,high,n):
    #print lst
    if  len(lst) == 0:
        return
    mid = low+high /2
    #print mid

    if ((mid==0 or lst[mid] >=lst[mid-1]) and (lst[mid>=lst[mid+1]] or mid==n)):
        return mid

    if ( mid > 0 and lst[mid-1]> mid ):
        return peakElement(lst,low,mid-1,n)
    else:
        return peakElement(lst,mid+1,high,n)




if __name__ == '__main__':
    print " Peak Element index ",peakElement(mylst,0,len(mylst),len(mylst))

