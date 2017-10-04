class Node:
    def __init__(self,data):
        self.data=data
        self.next=None

class Loop:
    def __init__(self):
        self.head=None

    def push(self,data):
        print "pushing",data
        new_node=Node(data)
        new_node.next=self.head
        self.head=new_node

    def display(self):
        temp=self.head
        while(temp):
            print temp.data
            temp=temp.next

    def printMiddle(self):
        print "searching middle element"
        fast=self.head
        slow=self.head
        while(slow and fast and fast.next):
            slow=slow.next
            fast=fast.next.next
        print slow.data

    # def printReverse(self,head):
    #     if head == None :
    #         print "Head is null"
    #         return
    #     printReverse(self.head)
    #     print "revese order"




    def checkLoop(self):
        print "checking loop"
        slow_p=self.head
        fast_p=self.head
        while(slow_p and fast_p and fast_p.next):
            slow_p=slow_p.next
            fast_p=fast_p.next.next
            if slow_p == fast_p:
                 print "loop detected"
                 return





l=Loop()
l.push(10)
l.push(20)
l.push(15)
l.push(200)
l.push(10)
l.display()
l.printMiddle()
l.head.next.next.next = l.head

l.checkLoop()
