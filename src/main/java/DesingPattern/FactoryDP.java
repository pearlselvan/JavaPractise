package DesingPattern;

import ObjectOrient.StringImmutable;

/**
 * Created by muthuselvan on 1/31/17.
 */


/*

Best Example of Factory method design pattern is valueOf() method which is there in String and wrapper classes
like Integer and Boolean and used for type conversion i.e. from converting String to Integer or String to double in java..

Some more examples of factory method design pattern from JDK is :

valueOf() method which returns object created by factory equivalent to value of parameter passed.
getInstance() method which creates instance of Singleton class.
newInstance() method which is used to create and return new instance from factory method every time called.
getType() and newType() equivalent of getInstance() and newInstance() factory method but used when factory method resides in separate class.





 */

public class FactoryDP {

    public static void main(String[] args) {

        String IN = CurrencyFactory.getCurrency("US").getCurrentcy();
        System.out.println("Currency Symbol : " +IN);



    }
}

interface CurrencySymbol {
    String getCurrentcy();
}


class India implements CurrencySymbol {
    public String getCurrentcy() {
        return "Rubee";
    }
}


class USA implements CurrencySymbol {
    public String getCurrentcy() {
        return "Dollar";
    }
}

class CurrencyFactory {

   //Return of this method will be interface : CurrencySymbol
    public static CurrencySymbol getCurrency(String currentSymbol) {
        if (currentSymbol.equals("IN")) {
            return new India();
        } else if (currentSymbol.equals("US")) {
            return new USA();
        } else {
            throw new IllegalArgumentException("No Currency");
        }
    }
}
/*
Best Example of Factory method design pattern is valueOf() method which is there in String and wrapper classes
like Integer and Boolean and used for type conversion i.e. from converting String to Integer or String to double in java..
 */
class JDKValueofFactory {
    public static void valueOfExample() {
        Double myDouble = 102939939.939 ;
        String doubleToString = String.valueOf(myDouble);
        System.out.println("doubleToString " +doubleToString);
    }

}
