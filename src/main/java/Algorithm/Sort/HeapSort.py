
'''
#  Approach:
#  Heap sort happens in two phases. In the first phase, the array
#  is transformed into a heap. A heap is a binary tree where
#  1) each node is greater than each of its children
#  2) the tree is perfectly balanced
#  3) all leaves are in the leftmost position available.
#  In phase two the heap is continuously reduced to a sorted array:
#  1) while the heap is not empty
#  - remove the top of the head into an array
#  - fix the heap.

Technical Details:
#  A heap is based on an array just as a hashmap is based on an
#  array. For a heap, the children of an element n are at index
#  2n+1 for the left child and 2n+2 for the right child.





'''

def sortme(mylist):
    print "sort",mylist
    length=len(list)
    print "Length",length

    mid=length/2

    #for i in range(length,-1,-1):
    for i in range(length, -1, -1):
       print "index" , i , "in" , mylist[i]

# Python program for implementation of heap Sort

# To heapify subtree rooted at index i.
# n is size of heap
def heapify(arr, n, i):
    largest = i  # Initialize largest as root
    l = 2 * i + 1     # left = 2*i + 1
    r = 2 * i + 2     # right = 2*i + 2

    print "Largest",largest
    print "i",i
    print "Left index" ,l
    # print "Left node",arr[l]
    print "Right index" ,r
    # print "Right node", arr[r]

    # See if left child of root exists and is
    # greater than root
    if l < n and arr[i] < arr[l]:
        print "Left child" ,arr[l]
        largest = l

    # See if right child of root exists and is
    # greater than root
    if r < n and arr[largest] < arr[r]:
        print "Right child" ,arr[r]
        largest = r

    # Change root, if needed
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i]  # swap

        # Heapify the root.
        heapify(arr, n, largest)


# The main function to sort an array of given size
def heapSort(arr):
    n = len(arr)

    # Build a maxheap.
    for i in range(n, -1,-1):  # srop and step
        print "i",i
        heapify(arr, n, i)


    # One by one extract elements
    for i in range(n-1, 0, -1):
        arr[i], arr[0] = arr[0], arr[i]   # swap
        heapify(arr, i, 0)


def heapyfy():
    print "heap"

if __name__ == '__main__':
    arr=[10,9,4,3,2]
    # heapSort(list)
    heapSort(arr)
    n = len(arr)
    print ("Sorted array is")
    for i in range(n):
        print ("%d" %arr[i]),




    # sortme(list)
