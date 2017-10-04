#
# def nextgreateElement(findNums,nums):
#     d = {}
#     st = []
#     ans = []
#
#     for x in nums:
#         while len(st) and st[-1] < x:
#             d[st.pop()] = x
#             st.append(x)
#         for x in findNums:
#             ans.append(d.get(x, -1))
#     return ans
#
#
# if __name__ == '__main__':
#     list=[4, 5, 2, 25]
#     nextgreateElement(5,list)

#https://leetcode.com/problems/next-greater-element-i/discuss/


class Solution(object):
    def nextGreaterElement(self, findNums, nums):
        d = {}
        st = []
        ans = []
        for x in nums:
            print x
            while len(st) and st[-1] < x:
                d[st.pop()] = x
            st.append(x)
        for x in findNums:
            print "X",x
            ans.append(d.get(x, -1))

        return ans

    def nextGreaterElement1(self, findNums, nums):
        d = {}
        st = []
        ans = []
        for x in nums:
            print x
            while len(st) and st[-1] < x:
                d[st.pop()] = x
            st.append(x)
        print st
        return ans.append(d.get(findnums, -1))

if __name__ == '__main__':
    s=Solution()
    list=[4, 5, 2, 25]
    findnums=[5]
    print s.nextGreaterElement1(findnums,list)














