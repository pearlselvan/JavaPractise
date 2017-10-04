#http://jelices.blogspot.com/2014/06/leetcode-python-merge-k-sorted-lists.html
#https://statyang.wordpress.com/python-practice-49-merge-k-sorted-lists/

'''

Analysis:

It is not hard to do the following analysis: the most straightforward
 solution would be: get the first Node of each list and find the one with smallest value,
  then create a node with this minimum value and add it to a new list created for return.
However, this simplest idea can not pass the test because of “exceeds of time limit”. Then if think a little bit deeper,
it is not hard to find that if the obtained first Node of each list can be sorted at every iteration,
there is a faster way to find the minimum value each time. Thus, ‘heap’ would be a good data structure
to collect all the ‘first’ nodes of each list at every iteration. Therefore, familiar to the usage of ‘heap’
 with python would be a big plus to solve this question.



'''
