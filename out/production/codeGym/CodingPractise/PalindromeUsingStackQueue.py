from Queue import Queue
class PalindromeUsingStackQueue:
    def isPalindrome(self,indata):
        matched=0
        print "Data" ,indata
        stack = []
        queue = Queue()
        print stack
        # stack.pop()
        print stack
        for i in xrange(len(indata)):
            stack.insert(0,indata[i])
            queue.put(indata[i])
            print stack

        while queue.empty():
            print queue.get() #first item
            print stack.pop() # last item
            print "queue is emppty "
        if (queue.get()!=stack.pop()):
            print "matched"
            matched+=1
            print "ma",matched
            return matched==0
        else:
            return matched==0











p=PalindromeUsingStackQueue()
p.isPalindrome("we")

