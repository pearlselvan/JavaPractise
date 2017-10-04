
# stack1 = [3, 2, 1, 1, 1]
# stack2 = [4, 3, 2]
# stack3 = [1, 1, 4, 1]


stack1 = [5, 1,  1, 1]
stack2 = [7, 3]
stack3 = [2, 1, 1, 1]

sum_of_Stack1= sum(stack1)
sum_of_Stack2= sum(stack2)
sum_of_Stack3= sum(stack3)

print sum_of_Stack1,sum_of_Stack2,sum_of_Stack3

max_Stack_Sum = max(sum_of_Stack1, sum_of_Stack2, sum_of_Stack3)
print("Max " , max_Stack_Sum)

for i in range(sum_of_Stack1+sum_of_Stack2+sum_of_Stack3):

    if (sum_of_Stack1 == sum_of_Stack2 == sum_of_Stack3):
        print("Value found : ", sum(stack1))
        break
    else:
        max_Stack_Sum = max(sum_of_Stack1, sum_of_Stack2, sum_of_Stack3)
        print "max in else" , max_Stack_Sum
        if max_Stack_Sum == sum_of_Stack1:
            stack1.pop(0)
            sum_of_Stack1 = sum(stack1)
        if max_Stack_Sum == sum_of_Stack2:
            stack2.pop(0)
            sum_of_Stack2 = sum(stack2)
        if max_Stack_Sum == sum_of_Stack3:
            stack3.pop(0)
            sum_of_Stack3 = sum(stack3)
else:
    print("value not found")
