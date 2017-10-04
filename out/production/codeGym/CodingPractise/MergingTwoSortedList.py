a = [3, 4, 6, 10, 11, 18]
b = [1, 5, 7, 12, 13, 19, 21]
result = []
print a
print b

while a and b:
    if (a[0] < b[0]) :
        result.append(a.pop(0))
    else:
        result.append(b.pop(0))
print result+a+b


