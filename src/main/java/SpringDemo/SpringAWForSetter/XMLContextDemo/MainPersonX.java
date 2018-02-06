package SpringDemo.SpringAWForSetter.XMLContextDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by muthuselvan on 11/10/17.
 */
public class MainPersonX {

    public static void main(String[] args) {
//        PersonX personX = new PersonX();
//        personX.speak();
        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        PersonX personX = (PersonX) ctx.getBean("person");
        personX.speak();
        System.out.println("InterfacePerson : " +personX);


        AddressX addressX = (AddressX) ctx.getBean("address");
        System.out.println("Address : " +addressX);

        ((FileSystemXmlApplicationContext) ctx).close();
    }
}
