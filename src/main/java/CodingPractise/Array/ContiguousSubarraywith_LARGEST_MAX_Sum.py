def kandane(mylst):
    print mylst
    max_end = 0
    max_so_far=0
    for i in range(len(mylst)):
        max_end=max(mylst[i],max_end+mylst[i])
        max_so_far=max(max_end,max_so_far)
    return max_so_far

"""
   max_end_here = Math.max(arrA[i], max_end_here+arrA[i]);
            max_so_far = Math.max(max_so_far,max_end_here);
"""

if __name__ == '__main__':
    mylst=[-2, -3, 4, -1, -2, 1, 5, -3]
    print kandane(mylst)
