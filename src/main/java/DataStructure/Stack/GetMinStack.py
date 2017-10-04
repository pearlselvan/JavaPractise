"""
Below code will not work : https://leetcode.com/problems/min-stack/discuss/
"""

class Stack:

    def __init__(self):
        self.min = 0
        self.items=[]

    def isEmpty(self):
        return self.items==[]

    def push(self , item):
        print "Pushing " ,item
        if len(self.items) == 0:
            self.min = item
        elif self.min > item:
            self.min = item
        self.items.append(item)

    def pop(self):
        return self.items.pop() # will remove the last item

    def size(self):
        return len(self.items)

    def peek(self):
        return self.items[-1] # will print last item in list

    def __str__(self):
        disp = "["
        for ele in self.container:
            disp = disp + " " + str(ele) + " "
        return disp + "]"

    def min(self):
        return self.min


s = Stack()
s.push(-2)
s.push(0)
s.push(-3)
#print "so far stack" ,items  # -2 0 -3
print "min 1",s.min # -3
s.pop() # poped -3 so top : 0
print s.peek()
print "min 2 ",s.min # -2
s.push(-100)
print "Top :",s.peek() # -100
print "min",s.min # 100


