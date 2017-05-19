package GenericDemo;

/**
 * Created by muthuselvan on 5/17/17.
 *
 * https://medium.com/@t.surkiss/generics-in-java-have-no-fear-generics-is-here-8eabe6f5d541
 * use case :
 *
 * 1. We will assume that Arrays.toString() does not exist and we need an integer array printing method: refer
 * printArray(int [] array) in below
 *
 * 2. If a double array printing method is required, a simple copy paste action (mastery of software developers)
 * followed by variable type name changes will result in: refer  printArray(double [] array) in below
 *
 * 3. Similarly, if a new printing method for string arrays  or different data type is needed,
 * we could copy-paste and change the variable name types. However, a close look at both methods reveals similarities.
 * The only difference between the two are the places in which we declare the variables.
 *
 *
 *
 * /
 */
public class PrintDifferentArrayDataType {

    public static void main(String[] args) {

/* =========================================================================================================*/

// Below use case is we want count the array but the data type can be any think like in below
        // it could be string / integer / double ..so we can implement using by overloading concept
        // by passing different argument but need to write 3 different overloading methong for string / double / int
        // but using genetic we can write one single generic will take care of all data types

        // check countElementinArray() generic impl

        PrintDifferentArrayDataType printDifferentArrayDataType = new PrintDifferentArrayDataType();
        Double [] doubleArray = new Double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
        System.out.println(printDifferentArrayDataType.countElementinArray(doubleArray));

        String[] stringArray = new String[] {"muthu","selvan","ram"};
        System.out.println(printDifferentArrayDataType.countElementinArray(stringArray));

        Integer[] integersArray = new Integer[] {100,200,300};
        System.out.println(printDifferentArrayDataType.countElementinArray(integersArray));


/* =========================================================================================================*/




        //
//
//
//        printArray(integerArray);
//
//        double [] doubleArray = new double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
//        printArray(doubleArray);

//        PrintDifferentArrayDataType printDifferentArrayDataType = new PrintDifferentArrayDataType();
//        System.out.println(printDifferentArrayDataType.getClass().getName());

//        Double [] doubleArray = new Double [] {3.14, 1.6180, 2.71828, 0.57721, 1.0};
//        this.<Double>printAnyArray(doubleArray);





    }

    public <T> int countElementinArray(T[] array) {
        return array.length;

    }






    //As per usecase 1 :
    public static void printArray(int [] array) {
        StringBuilder arrayPrintString = new StringBuilder("Array: ");
        if (array != null && array.length != 0) {
            for (Integer printObject : array) {
                arrayPrintString
                        .append(printObject)
                        .append("|");
            }
        } else {
            arrayPrintString.append("Empty Array");
        }
        System.out.println(arrayPrintString);
    }
    //As per usecase 2
    public static void printArray(double [] array) {
        StringBuilder arrayPrintString = new StringBuilder("Array: ");
        if (array != null && array.length != 0) {
            for (Double printObject : array) {
                arrayPrintString
                        .append(printObject)
                        .append("|");
            }
        } else {
            arrayPrintString.append("Empty Array");
        }
        System.out.println(arrayPrintString);
    }

    public  static <ArrayType> void printAnyArrayGeneric(ArrayType [] array) {
        StringBuilder arrayPrintString = new StringBuilder("Array: ");
        if (array != null && array.length != 0) {
            for (ArrayType printObject : array) {
                arrayPrintString
                        .append(printObject)
                        .append("|");
            }
        } else {
            arrayPrintString.append("Empty Array");
        }
        System.out.println(arrayPrintString);
    }

}
