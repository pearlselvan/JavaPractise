package ObjectOrient;

/**
 * Created by muthuselvan on 2/5/17.
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
