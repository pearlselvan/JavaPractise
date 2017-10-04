# list = [3, 1, 2, 2, 1, 1, 3, 3]
list = [12, 35, 1, 10, 34, 1]

larg1 = larg2 = 0

for ele in list:
    print "Element" ,ele
    if ele > larg1:
        larg2 = larg1
        larg1 = ele
    elif ele > larg2 and ele != larg1:
        larg2 = ele

print(larg1, larg2)
