package ObjectOrient;

/**
 * Created by muthuselvan on 2/5/17.
 */

/*
Loose-Coupling:-
----------------
1.    In Loose-Coupling, when one object is depending on another class object, some external
entity will provide that dependency object to the main object that external object we call as a Container.

In order to get loose-coupling between objects the following two rules are required
-------------------------------------------------------------------------------------
http://javaeasy.weebly.com/types-of-coupling.html
1.    The classes should follow POJI/POJO model.
2.    Apply dependency injection mechanism.


 */

/*
 http://www.java4s.com/spring/spring-core-module-spring-ioc-tutorial/
 */
public class LooselyCoupling {

    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        USA usa = new USA();
        transfer.setMoney(usa);
        transfer.Transfer();
    }


}

interface Money {
    void sendMoney() ;

}


class USA implements Money {

    @Override
    public void sendMoney() {
        System.out.println("Sending money in doller");
    }
}


class India implements Money {
    @Override
    public void sendMoney() {
        System.out.println("Sending money in Rubee");
    }
}

class Transfer {
    Money money;
    public void setMoney(Money money) {
        this.money = money;
    }

    public void Transfer() {
        money.sendMoney();
    }
}
