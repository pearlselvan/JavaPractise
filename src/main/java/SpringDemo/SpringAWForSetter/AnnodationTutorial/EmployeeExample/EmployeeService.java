package SpringDemo.SpringAWForSetter.AnnodationTutorial.EmployeeExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by muthuselvan on 11/9/17.
 */
@Component
public class EmployeeService {



    private EmployeeBean employeeBean;


//    @Autowired(required=false)
//@Autowired
//    public EmployeeService(@Qualifier("employee") EmployeeBean employeeBean) {
//    public EmployeeService(EmployeeBean employeeBean) {
//        this.employeeBean = employeeBean;
//    }

    public EmployeeService() {
    }


    @Autowired
    public EmployeeBean getEmployeeBean() {
        return employeeBean;
    }

    @Autowired
    public void setEmployeeBean(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }


}
