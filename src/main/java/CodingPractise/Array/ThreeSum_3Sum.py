def get3nums( list, sum):
    print "Complementry :" , sum ,"-org list" , list

    done = []
    match = False
    results = []
    for i in range(len(list)): # iterating original list
        list1 = list[:]
        print "Copy list" , list1
        list1.pop(i) # pop the index 0
        comp=sum-list[i]
        print "Copy list after poped" , list1 , "complementry " , comp
        if comp in list1 and list[i] not in done:
            done.append(comp) # done for stroing cmplement
            results.append((list[i] ,comp ))
    # print(results)
    return results

list = [1,2,-5, 4, 6,-8, 3, 7, 9]
sum = -7

# get2nums(list, sum)

for i in range(len(list)): # iterate the list
    list1 = list[:] # just copy the list
    list1.pop(i) # pop the element from copy list
    # print (i, list1)
    ele = list[i] # assign the element for iterate the values
    complementry=sum-ele
    results = get3nums(list1, complementry) # pass the copy list ( first item popped and complementry]
    for tuple in results:
        # print ( (list[i], tuple[0], tuple[1]) , end = " " )
        # print ( (list[i], tuple[0], tuple[1]) )
        print (list[i],tuple[0],tuple[1])
        # print (tuple[0])
        # print (tuple[1])
