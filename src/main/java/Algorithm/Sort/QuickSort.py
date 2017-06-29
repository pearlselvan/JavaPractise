#http://interactivepython.org/courselib/static/pythonds/SortSearch/TheQuickSort.html
def quickSort(alist):
    quickSortHelper(alist,0,len(alist)-1)

def quickSortHelper(alist,first,last):
    if first<last: # This is recurion breaking condition

        splitpoint = partition(alist,first,last) # partition using pivot element

        quickSortHelper(alist,first,splitpoint-1)
        quickSortHelper(alist,splitpoint+1,last)

'''
let’s call them leftmark and rightmark—at the beginning and end of the remaining
 items in the list (positions 1 and 8 in Figure 13). The goal of the partition
  process is to move items that are on the wrong side with respect to the pivot
  value while also converging on the split point
'''
def partition(alist,first,last):
    pivotvalue = alist[first]

    leftmark = first+1
    rightmark = last

    done = False
    while not done:

        while leftmark <= rightmark and alist[leftmark] <= pivotvalue:
            leftmark = leftmark + 1

        while alist[rightmark] >= pivotvalue and rightmark >= leftmark:
            rightmark = rightmark -1

        if rightmark < leftmark:
            done = True
        else:
            temp = alist[leftmark]
            alist[leftmark] = alist[rightmark]
            alist[rightmark] = temp

    temp = alist[first]
    alist[first] = alist[rightmark]
    alist[rightmark] = temp


    return rightmark

alist = [54,26,93,17,77,31,44,55,20]
quickSort(alist)
print(alist)
