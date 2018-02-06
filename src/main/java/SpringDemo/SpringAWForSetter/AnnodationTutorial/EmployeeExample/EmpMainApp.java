package SpringDemo.SpringAWForSetter.AnnodationTutorial.EmployeeExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by muthuselvan on 11/9/17.
 * https://www.concretepage.com/spring/spring-autowired-annotation-example-with-setter-method-field-and-constructor-using-xml-and-java-configuration
 */
public class EmpMainApp {

//    @Autowired
//    EmployeeService employeeService ;

    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setName("muthu");
        employeeService.setEmployeeBean(employeeBean);
        System.out.println(employeeService.getEmployeeBean().getName());

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        EmployeeService service = ctx.getBean(EmployeeService.class);
        System.out.println(service.getEmployeeBean().getName());
        ctx.close();

    }
}
