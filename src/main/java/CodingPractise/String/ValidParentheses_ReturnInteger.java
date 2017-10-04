package CodingPractise.String;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by muthuselvan on 2/7/17.
 * Discussion :
 * https://leetcode.com/problems/longest-valid-parentheses/discuss/
 */

/*
1. Scan the string from left and check if this open parenthis
2. if yes then push
3. else ( if close parenthisis)
4. then peek and check with current char
5. finally : if stack is empty then valid

Time Complexity: O(n)
Auxiliary Space: O(n) for stack.



Test Case #1
Input:

")"
Expected:

1
Actual:

0
StdError:
undefined
java.lang.AssertionError: expected:<0> but was:<1>
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.failNotEquals(Assert.java:834)
	at org.junit.Assert.assertEquals(Assert.java:645)
	at org.junit.Assert.assertEquals(Assert.java:631)
	at SolutionTest.testSomething1(SolutionTest.java:12)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:105)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:94)
	at Start.start(Start.java:11)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.runTestClass(JUnitTestClassExecuter.java:114)
	at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassExecuter.execute(JUnitTestClassExecuter.java:57)
	at org.gradle.api.internal.tasks.testing.junit.JUnitTestClassProcessor.processTestClass(JUnitTestClassProcessor.java:66)
	at org.gradle.api.internal.tasks.testing.SuiteTestClassProcessor.processTestClass(SuiteTestClassProcessor.java:51)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
	at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
	at org.gradle.internal.dispatch.ContextClassLoaderDispatch.dispatch(ContextClassLoaderDispatch.java:32)
	at org.gradle.internal.dispatch.ProxyDispatchAdapter$DispatchingInvocationHandler.invoke(ProxyDispatchAdapter.java:93)
	at com.sun.proxy.$Proxy1.processTestClass(Unknown Source)
	at org.gradle.api.internal.tasks.testing.worker.TestWorker.processTestClass(TestWorker.java:109)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:35)
	at org.gradle.internal.dispatch.ReflectionDispatch.dispatch(ReflectionDispatch.java:24)
	at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:146)
	at org.gradle.internal.remote.internal.hub.MessageHubBackedObjectConnection$DispatchWrapper.dispatch(MessageHubBackedObjectConnection.java:128)
	at org.gradle.internal.remote.internal.hub.MessageHub$Handler.run(MessageHub.java:404)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
	at org.gradle.internal.concurrent.StoppableExecutorImpl$1.run(StoppableExecutorImpl.java:46)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
	at java.lang.Thread.run(Thread.java:748)
Test Case #2
Input: "(",Expected: 1,Actual: 1
Test Case #3
Input: "(())",Expected: 0,Actual: 0
Test Case #4
Input: "(()",Expected: 1,Actual: 0
Test Case #5
Input: "())(",Expected: 2,Actual: 1
Test Case #6
Input: "))))",Expected: 4,Actual: 1
Test Case #7
Input: ")(",Expected: 2,Actual: 1
Test Case #8
Input: "()()()()()",Expected: 0,Actual: 0
RUN CODE
RUN TESTS


import java.io.*;
import java.util.*;

class Solution {

  static int bracketMatch(String text) {
    if (text == null) {
      return -1;
    }

    // ""
    text = text.trim();
    if (text.length() < 2) {
      return text.length();
    }

    // your code goes here
    Stack<Character> stack = new Stack<>();

    for (Character s : text.toCharArray()) {
      // //))
      //s->))

      //())(
      //())( -faili

      if (s == ')' && !stack.empty() && stack.peek()=='(') {
        stack.pop();
      } else {
        stack.push(s);
      }
    }

    return stack.size();
  }

  public static void main(String[] args) {



  }

}


static int bracketMatch(String text) {
    // your code goes here

     int openRemaining = 0;
     int count = 0;

     for(int j = 0; j < text.length(); j++)
     {
       if (text.charAt(j) == ')' && openRemaining == 0)
       {
         count++; //c=4
       }
       else if (text.charAt(j) == ')' && openRemaining > 0 )
       {
         openRemaining--;
       }
       else if (text.charAt(j) == '(')
       {
         openRemaining++; //or=1
       }

     }

    count = count + openRemaining;  //4


    return count;
  }







 */


public class ValidParentheses_ReturnInteger {

    public ValidParentheses_ReturnInteger() {

    }

    public static void main(String[] args) {
//        System.out.println("Valied " +isValid("{{{{{{{{"));
        System.out.println("Valied " +isValid("))("));
//        System.out.println(assert 4==4);
//        System.out.println("Valied without using HM : " +checkBalance("()"));
//        assert 1 != 0;

    }

    //Using HashMap
    public static int  isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        //  System.out.println("KEY" +map.entrySet().contains('}'));

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();

                } else {
                    System.out.println("Size : " +s.length());
                    return s.length();
                }
            }
        } //End for loop


        System.out.println("Stack Size : " +stack.size());
        return stack.size();
//        return stack.empty();
    }

    //Without using HashMap - Recommended
    public static String  checkBalance(String str) {
        Stack stack = new Stack();
        // iterate the string and convert into char using charAt
        for (int i = 0; i < str.length(); i++) {
            // Get the current char
            char ch = str.charAt(i);
            // check if current char contains open parenthisis
            if (ch == '[' || ch == '(' || ch == '{') {
            //then push
                stack.push(ch);
             //else check the current char is close parenthis and stack is not empty
            } else if ((ch == ']' || ch == '}' || ch == ')')
                    && (!stack.isEmpty())) {
                // check with peek the element with current chart then pop
                if (((char) stack.peek() == '(' && ch == ')')
                        || ((char) stack.peek() == '{' && ch == '}')
                        || ((char) stack.peek() == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    return "Not Balanced";
                }
            } else {
                if ((ch == ']' || ch == '}' || ch == ')')) {
                    return "Not Balanced";
                }
            }
        }
        if (stack.isEmpty())
            return "Balanced Parenthisis";
        else
            return "Not Balanced";
    }
}
