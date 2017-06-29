ss = """I figured it out
I figured it out from black and white
Seconds and hours
Maybe they had to take some time"""

words = ss.split()
print "W",words
d = {}.fromkeys(words,0)
for w in words:
    d[w] += 1
print d
