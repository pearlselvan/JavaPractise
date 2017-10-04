"""
 Examples:
 *  ---------
    Input: n = 5
    Output: 1
    Factorial of 5 is 20 which has one trailing 0.

    Input: n = 20
    Output: 4
    Factorial of 20 is 2432902008176640000 which has
    4 trailing zeroes.

    Input: n = 100
    Output: 24

    Simple and Problem :
    --------------------

    A simple method is to first calculate factorial of n,
    then count trailing 0s in the result (We can count trailing 0s by repeatedly dividing the factorial by 10 till
    the remainder is 0).

    The above method can cause overflow for a slightly bigger numbers as factorial of a number
     is a big number (See factorial of 20 given in above examples).
    The idea is to consider prime factors of a factorial n. A trailing zero is always produced
      by prime factors 2 and 5. If we can count the number of 5s and 2s, our task is done.

    Math approach :
    ----------------
    Trailing 0s in n! = Count of 5s in prime factors of n!
    = floor(n/5) + floor(n/25) + floor(n/125) + ....

    floor means : (5/2) = 2.5 ...this will return 2

     if n = 100 then o/p :
     count : 20's 5 + 4's 100 so count : 24


 *
 * Explanation :
 * http://www.purplemath.com/modules/factzero.htm
 *
 * Program :
 * http://www.geeksforgeeks.org/count-trailing-zeroes-factorial-number/
 *
 *
 *
 *
 */

 int count=0;
        for (int i=5;number/i>=1; i *= 5) {
            count += number/i;
            System.out.println("i : " +i);
            System.out.println("count : " +count);
        }
        return count;

"""

def counttraillingZero(number):
    print number
    count=0;
    for number1 in range(2, number+1):
        print "N",  number1



def Trailing_Zeroes(x):
    fives = 0
    for number in range(2, x+1):
        while number > 0:
            if number % 5 == 0:
                fives += 1
                number = number/5
            else:
                break
    return fives



def factorial(number):
    if number==0:
        return 1
    else:
        return number * factorial(number-1)

# counttraillingZero(10)
# print factorial(5)
print Trailing_Zeroes(10)
if __name__ == '__main__':
    for x in range(5 ,5):
        print x
        if x==25:
            break
        else:
            print "X" ,x
