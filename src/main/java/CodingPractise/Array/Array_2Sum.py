# list = [1,-2,-5,4,6,-8]
# target = -7

list = [1,-2,4,6,2]
target = 8


result = []

match = False
for i in range(len(list)):
    # complemnt = eval sum-list[i]
    complemnt = target-list[i]
    print "Complement " , complemnt
    list1 = list[:i-1] + list[i+1:]
    if target-list[i] in list1 and list[i] not in result:
        match = True
        result.append(target - list[i]) # done for storing cmplement
        print ("set :" , (list[i] , target - list[i]))
        tub = (ist[i] , target - list[i])
        print ("Result" , result)
    elif i == len(list)-1 and match==False:
        print("match not found")
