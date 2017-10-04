'''
Insertion Sort using it for finding median
http://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/
If we can sort the data as it appears, we can easily locate median element.
Insertion Sort is one such online algorithm that sorts the data appeared so far.
At any instance of sorting, say after sorting i-th element, the first i elements of array are sorted.
The insertion sort doesn’t depend on future data to sort data input till that point. In other words,
insertion sort considers data sorted so far while inserting next element. This is the key part of insertion sort that makes it an online algorithm.

However, insertion sort takes O(n2) time to sort n elements. Perhaps we can use binary search on insertion sort
to find location of next element in O(log n) time. Yet, we can’t do data movement in O(log n) time. No matter how efficient the
 implementation is, it takes polynomial time in case of insertion sort.
'''

def insertionSort(alist):
    for index in range(1,len(alist)):

        currentvalue = alist[index]
        position = index

        while position>0 and alist[position-1]>currentvalue:
            alist[position]=alist[position-1]
            position = position-1

        alist[position]=currentvalue

alist = [54,26,93,17,77,31,44,55,20]
insertionSort(alist)
print(alist)



data=[10,3,4,5,7]
if __name__ == '__main__':
    insertionSort(data)


