#http://www.geeksforgeeks.org/segregate-even-and-odd-numbers/
class OddEvenSeparate:
    def __init(self):
        pass
    def separate(self,mylist):
        print "in",mylist
        start=0;end=len(mylist)-1
        while start<end:
            print start
            while(mylist[start]%2==0 and start<end):
                start=start+1
            while(mylist[end]%2==1 and start<end):
                end=end-1;
            print "start",start
            print "end",end
            if (start<end):
                temp=mylist[start]
                mylist[start]=mylist[end]
                mylist[end]=temp
                start=start+1
                end=end-1
        return mylist


    def separate_smallest_code(self,mylist):
        for ele in range(len(mylist)):
            if mylist[ele] % 2 == 0:
                even=mylist.pop(ele)
                mylist.insert(0,even)
        return mylist



if __name__=='__main__':
    # mylist=[-99,21,20,11,2000,51,61,-100]
    mylist=[99,21,20,11,2000,51,61,100,91,92, 93,95,97,101]
    sp=OddEvenSeparate()
    print sp.separate(mylist)
    print sp.separate_smallest_code(mylist)

