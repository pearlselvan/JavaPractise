package SpringDemo.SpringAWForSetter.XML_Init_Destroy_Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by muthuselvan on 11/11/17.
 */
public class EmpXMain {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        EmpServiceBean emp = (EmpServiceBean) context.getBean("emp");
        emp.getName();
        EmpServiceBean emp2 = (EmpServiceBean) context.getBean("emp");



        EmpServiceBean emp3 = emp2;

        emp3.setName("EMP_CHNAGED");

        System.out.println(emp3);


        System.out.println(emp.hashCode());
        System.out.println(emp2.hashCode());



        // PNAME EX
        System.out.println("P Name space Example ");

        //ApplicationContext pcontext = new FileSystemXmlApplicationContext("beans.xml");

        PNameSpace pnameContext = (PNameSpace) context.getBean("pname");
        System.out.println(pnameContext);




        ((FileSystemXmlApplicationContext) context).close();





    }

}
