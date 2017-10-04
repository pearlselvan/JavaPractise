from collections import Counter
mylist=["google","apple","google","yahoo"]

print collections.Counter(mylist).items()

print mylist
cnter=Counter()
for word in mylist:
    cnter[word]+=1
print cnter

