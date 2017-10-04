package DataStructure.Stack;

/**
 * https://www.youtube.com/watch?v=DxW7VAsdX0o
 * Created by muthuselvan on 5/3/17.
 * push : on top of the element
   pop : The last element pushed will be removed
 *
 *
 ===========================
 * N=1 ( N is number of stack )
   S={10,12,23,0}
       ^
    Push :Have one pointer in top and move the pointer when item added
    Pop : Remove the item from current pointer
 ===========================

   N= 2
   S={0,0,0,0,0,0,0}
      ^       ^
      TOP1    TOP2

 Divide the array into two equal ( mid element )
 Push the element top and move the pointer till mid if the element is pushed in first stack
 Push the element top=mid+1 and move the pointer till last size of the array if the element pushed in second stack

 Pop : if the element is poped from first stack the goto current pointer in stack1 then get the element
 Pop : if the element is poped from second stack the goto current pointer in stack2 then get the element
 ===========================

 Having top2 pointer in last , the advantage about this we can use fully array capacity to store the
 element

  N=2
 S={0,0,0,0,0,0,0}
 ^              ^
 TOP1           TOP2

 1. Push the element top and move the pointer till the top1 and top2 pointer is meet
 2.Push the element from end of the array and move the pointer till the top1 and top2 pointer is meet

 -----
 Before seeing the link , watch https://www.youtube.com/watch?v=DxW7VAsdX0o for N=3

 http://www.geeksforgeeks.org/efficiently-implement-k-stacks-single-array/


 Method 2 (A space efficient implementation)
 The idea is to use two extra arrays for efficient
 implementation of k stacks in an array.
 This may not make much sense for integer stacks,
 but stack items can be large for example stacks of employees, students, etc where every item is of hundreds of bytes
 . For such large stacks, the extra space used is comparatively
 very less as we use two integer arrays as extra space.

 Following are the two extra arrays are used:
 1) top[]: This is of size k and stores indexes of top elements in all stacks.
 2) next[]: This is of size n and stores indexes of next item for the items in array arr[]. Here arr[] is actual array that stores k stacks.
 Together with k stacks, a stack of free slots in arr[] is also maintained. The top of this stack is stored in a variable ‘free’.

 All entries in top[] are initialized as -1 to indicate that all stacks are empty. All entries next[i] are initialized as i+1 because all slots are free initially and pointing to next slot. Top of free stack, ‘free’ is initialized as 0.

 top[] array map to stack number to the position in array index , that is
 Ex : top will initialized : top {-1,-1,-1} , it mean that no element is added in stack
 if you are adding s.push(0,10) adding 10 in first stack the top[] array will become
 top {0,-1,-1}

 if top[] contain 0 ,1 2 (non negative number ) then there is atleast one element added (stack is not empty)

 stackdata = {0,0,0,0,0,0} is used to maintain stack data (pushing / pop ) the element into the stack
 int nextavailable = 0 , why its zero because we are going to add in zero index , if one element is
 added then its beocome nextavailable = 1 because we next element will be added in 1 position
 in single word , the number in nextavailable for adding next element in that position

 initialized nextindex = {1,2,3,4,5,-1}  this will do two purpose :
 purpose 1 :

 when nextindex will be change ? what it wll be changed ?

  next[] = {1,2,3,4,5,-1}
            ^
            This will be the previous top of the stack thats when initlized the top[] it will be -1

 Ans : When we pop the element of the stack we need to get the previous element in that stack
 and set the top of stack value to be previous element

 its giving to have the purpose of when the element is set its going to point to the previous index of the
 previous item in the stack  , when its not set its is going to point the next available item

 when all of them avaiable then array for nextindex is empty because there is nothing in that stack


 purpose 2 :



  Flow :

 Declare and intilized the variable :
 int nextavailable = 0  //which index i need to put the data
 int next[] = {1,2,3,4,5,-1}
 int data[] = {0,0,0,0,0,0}
 top[] ={-1,-1,-1} // negative mean stack is empty

 when push (0,10): zero the stack then push 10
 1.Go to the nextavailable , get the index
 2 update stack the in index where you go the index from the above get index
 3.update the nextavaialble in top of the stack
 4.update the next[] to previous top of the stack
 5. finally : update the nextavailable thats increment one

 when pop(0) : get top of the element from zero th stack
 1. go to the top[] and get the corresponding index that is if its zero then zero the index value
 2. from the index value , look up data and return the data , this is top element in zero the stack
 3  then we need to set next[] as nextavailable (go to the data which poped , get the popped index and update in next[] , please note that when updating next[] , update the index in next which
 is corresponding to the data's index
 4. update the top of the data is previous value in next[]

 Note : Not required chagen the data when poping becaues the element value will be overriding when pushing the element






 */
public class NStackwithSingleArray {

    int[] topOfStack ; // size will ne number of stack and content is : indexes of top elements in all stacks , default all -1
    // if element added in all stack then will be non negative number
    int[] stackdata; // this will be main totol number of element (capacity ) going to add in stack ..example 9 element in 3 stack ?
    //so size is capacity
    int[] nextindex ; //size is same as capacity size , This index will be the previous top of the stack ,thats topOfStack[] values
    int nextAvailable = 0 ; // initilized zero because initlally we are going to update zero the index in stackdata

    // constructor initialized with totol number of stack and capacity (ie ; total number of element we are going to add)
    public NStackwithSingleArray(int numStacks,int capacity) {
        topOfStack = new int[numStacks] ;
        for(int i=0;i<topOfStack.length;i++) {
            topOfStack[i] = -1;
        }
        stackdata = new int[capacity] ; //default all will be zero
        nextindex = new int[capacity] ; // default {1,2,3,4,5,6 -1 } that last element will be -1 and first will be index+1

        for (int i=0;i<nextindex.length-1;i++) {
            nextindex[i] = i+1;
        }
        nextindex[nextindex.length-1] = -1;
    }


    public static void main(String[] args) {
        NStackwithSingleArray nStackwithSingleArray = new NStackwithSingleArray(3,9);
        nStackwithSingleArray.push(1,10);
        nStackwithSingleArray.push(1,20);
        nStackwithSingleArray.push(1,30);
        nStackwithSingleArray.push(1,40);
        nStackwithSingleArray.push(1,50);
        nStackwithSingleArray.push(2,50);
        nStackwithSingleArray.push(0,50);
        nStackwithSingleArray.push(0,50);
        nStackwithSingleArray.push(0,150);
        nStackwithSingleArray.push(1,150);
//        nStackwithSingleArray.push(3,50);
        System.out.println(nStackwithSingleArray.pop(1));
        System.out.println(nStackwithSingleArray.pop(2));
        System.out.println(nStackwithSingleArray.pop(2));

    }


    public void push(int stack,int value) {

        if (stack < 0 || stack >= topOfStack.length) {
            throw new IndexOutOfBoundsException();
        }

        //make sure nextavailable put
        // if there is no more avalable stack in array
         if (nextAvailable < 0 ) return;

        //cache my current index in nextavailable
        int currenindex = nextAvailable; // currentindex is index when i am going to add the element stackdata
        nextAvailable=nextindex[currenindex];
        stackdata[currenindex] = value;
        // next is going to point previous top of the stack , because that wil be prviooe element
        nextindex[currenindex] = topOfStack[stack] ;
        topOfStack[stack] = currenindex; //where we are adding most recent item
    }

    public int pop(int stack) {
        if (stack < 0 ||  stack >=topOfStack.length) {
            throw new IndexOutOfBoundsException();
        }

        //make sure stack is empty  . we can handle own exception stackEmptyException
        if (topOfStack[stack] < 0) return -1;

        int currentindex = topOfStack[stack]; //when poping the element from array
        int value = stackdata[currentindex] ;
        topOfStack[stack] =  nextindex[currentindex];
        nextindex[currentindex] = nextAvailable;
        nextAvailable=currentindex;
        return value;
    }

}
