#https://www.hackerrank.com/challenges/missing-numbers/problem
# list1 = [203, 204, 205, 206, 207, 208, 203, 204, 205, 206]
# list2 = [203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204]

# list1 = [3,3,4]
# list2 = [3,3,3,4]


list1 = [3,4,3]
list2 = [3,4,3,3]

dict = {}

for ele in list2:
    if dict.get(ele) == None:
        dict[ele] = 1
    else:
        dict[ele] = dict[ele] +1



print ("list 2 count " , dict)

for ele in list1:
    dict[ele] = dict[ele] -1

print("finally " ,dict.items())

for key, value in dict.items():
    if value > 0:
        print key,
