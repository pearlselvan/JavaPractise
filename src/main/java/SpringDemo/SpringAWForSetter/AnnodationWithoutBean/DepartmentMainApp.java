package SpringDemo.SpringAWForSetter.AnnodationWithoutBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DepartmentMainApp {

    public static void main(String[] args) {

        ImplManager implManager = new ImplManager();
        ImplDeveloper implDeveloper = new ImplDeveloper();
        PayrollDept payrollDept = new PayrollDept();
        payrollDept.setImplDeveloper(implDeveloper);
        payrollDept.setImplManager(implManager);
        payrollDept.setDevSalary("100");
        payrollDept.setManSalary("99");
        System.out.println(payrollDept.getDevSalary());
        System.out.println(payrollDept.getManSalary());


        System.out.println("Using Annodation 100%");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        PayrollDept implManager1 = context.getBean(PayrollDept.class);
        System.out.println("Developer Salary : " +implManager1.getDevSalary());
        System.out.println("Manage Salary : " +implManager1.getManSalary());
        System.out.println("Company Name : " +implManager1.getCmpName());


//        ApplicationContext context = new FileSystemXmlApplicationContext("DepartmentBean.xml");









    }
}
