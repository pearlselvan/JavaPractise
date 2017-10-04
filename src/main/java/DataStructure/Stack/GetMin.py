import sys
minv=1000000
lst=[]


def pushdata(data):
    lst.append(data)
    if (data <= minv):
        lst.append(minv)
        minv=data
    lst.append(data)


# def popdata():
#     if lst.pop() == minv:
#         minv=lst.pop()


def getmin():
    return minv

# pushdata(10)
# pushdata(20)
#
# print getmin()

# print lst
# print minv
#
if __name__ == '__main__':
    minv=0
    pushdata(10)
