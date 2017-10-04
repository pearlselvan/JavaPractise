# source = "ADOBECODEBANC"
# target = "ABC"
source = "thisisateststring"
target = "ist"
"""
Given a string source and a string target,
find the minimum window in source which will contain all the characters in target.



If there is no such window in source that covers all characters in target, return the emtpy string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in source.

Clarification
Should the characters in minimum window has the same order in target?

Not necessary.
Example
For source = "ADOBECODEBANC", target = "ABC", the minimum window is "BANC"

Challenge
Can you do it in time complexity O(n) ?

Logic is : creating dictionary for Target  : Key : character from string , Value :  How many character
Check if Target length == Target Dictionalry , if true then found first min ..then contiune search
 if target character available in string , if yes then update the dictionary values with matched value by
 replacing existing values thats first min values ..finally return min by ...

 Example :
  SRC = ADOBECODEBANC
  TARGET =ABC

  | A | D | O | B | E | C | O | D | E | B | A | N | C
  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11| 12

  DICT_VALUES = { A=0 , B=3, C=5 } on first iteration ( after matched all target _
  DICT_VALUES in second iteration = { A =10  B=9 C=12 } so take min : 9 and max : 12
  so find the sub string of 9 and 12 , that will be result : BANC






"""

minstr= ""
targetdict = {}
print "Source : " ,source
print "Target :", target
for i in range(len(source)):
    print "Current source[i] : ",source[i]
    if source[i] in target:
        targetdict[source[i]] = i
        print "Assigned Target Dict",targetdict

        tempmax= ""
        if len(targetdict)==len(target):
            values = sorted(list(targetdict.values()))
            tempmax = source[values[0]:values[-1]+1]
            print tempmax

        if len(minstr) != 0 and len(tempmax) < len(minstr):
            minstr = tempmax
        elif len(minstr) == 0:
            minstr = tempmax

print(minstr)
