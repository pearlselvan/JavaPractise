def checkInterWeave(first,second,input):

    if (len(first) + len(second) !=len(input)):
        return False

    print "Orginal length of s1 " , len(first)
    print "Orginal length of s1 " , len(seconds)

    i=0 # index ptr for s1
    j=0 # index ptr for s2
    traverse_s1 = True
    traverse_s2 = True
    for char in input:
        print(char, i, j, traverse_s1, traverse_s2, s2[j])
        if traverse_s1 and s1[i] == char:
            print ("s1", char, i)
            i = i+1
            print ("Current i",i ,"and length of s1 " ,len(s1))
            #false when end of the string reached and matched with all string in s1
            traverse_s1 = False if len(s1) == i else True
        elif traverse_s2 and s2[j] == char:
            print ("s2", char, j)
            j = j+1
            print ("Current j",j ,"and length of s2 " ,len(s2))
            #false when end of the string reached and matched with all string in s2
            traverse_s2 = False if len(s2) == j else True
        else:
            return False
    return True


# input = "aadbbcbcac"
# s1 = "aabcc"
# s2 = "dbbac"
#abcd","ade","abadcde"
input="abadcde"
s1="abcd"
s2="ade"
print(checkInterWeave(s1,s2,input))
