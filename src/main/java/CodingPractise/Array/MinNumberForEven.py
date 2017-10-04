# Python program to add minimum number
# so that the sum of array becomes even

# Function to find out minimum number
def minNum(arr, n):
    # Count odd number of terms in array
    odd = 0
    for i in range(n):
        if (arr[i] % 2):
            odd += 1
    print odd
    if (odd % 2):
        return 1
    return 2


def minNumUsingLambda(lst):
    """
    idea is to find the odd , [True, True, True, True, False, False] and count the false
    """
    return map(lambda x:  x%2==0,lst).count(False)




#http://www.geeksforgeeks.org/add-minimum-number-to-an-array-so-that-the-sum-becomes-even/

if __name__ == '__main__':
# Driver code
# arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    arr=[93,92,91,98]
    n = len(arr)
    print minNum(arr, n)
    print "Using lambda" ,minNumUsingLambda(arr)

