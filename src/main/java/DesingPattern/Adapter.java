package DesingPattern;

/**
 * Created by muthuselvan on 1/31/17.
 */

/*
The classes/objects participating in adapter pattern:
Target - defines the domain-specific interface that Client uses.
Adapter - adapts the interface Adaptee to the Target interface.
Adaptee - defines an existing interface that needs adapting.
Client - collaborates with objects conforming to the Target interface.

 */
public class Adapter {


}




interface ClassicGateway {
    public void sendPaperCash(Integer amount);
}

interface DigitalGateway {
    public void sendDigitalCash(Integer amount,Integer code);
    public void sendQuickCash(Integer amount,Integer code);
}

class Ebay implements DigitalGateway {

    @Override
    public void sendDigitalCash(Integer amount,Integer code) {
        System.out.println("Sening :" +amount+ "for Ebay online shopping using Digital Cash ");
    }

    public void sendQuickCash(Integer amount,Integer code) {
        System.out.println("Sening :" +amount+ "for Ebay online shopping using Quick Cash ");
    }
}

class Amazon implements DigitalGateway {

    @Override
    public void sendDigitalCash(Integer amount,Integer code) {
        System.out.println("Sening :" +amount+ "for Amazon online shopping using Digital Cash ");
    }

    public void sendQuickCash(Integer amount,Integer code) {
        System.out.println("Sening :" +amount+ "for Amazon online shopping using Quick Cash ");
    }
}

// The adapter class should implement older interface and
// will have the instance for new interface
class DigitalPaymentAdapter implements ClassicGateway  {
    //new interface's instance
    DigitalGateway digitalGateway ;
    @Override
    public void sendPaperCash(Integer amount) {


    }

    public DigitalPaymentAdapter(String onlineShopping) {
        if (onlineShopping.equals("Ebay")) {
            digitalGateway = new Ebay();
        } else {
            digitalGateway = new Amazon();
        }
    }


}

