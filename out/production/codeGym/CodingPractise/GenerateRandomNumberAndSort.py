import random

result=[]
for x in range(6):
    result.append(random.randint(1,9))
print result
print sorted(result)