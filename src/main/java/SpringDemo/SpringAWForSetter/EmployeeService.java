package SpringDemo.SpringAWForSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by muthuselvan on 11/9/17.
 */
@Service
public class EmployeeService {



    private EmployeeBean employeeBean;


//    @Autowired(required=false)
//@Autowired
    public EmployeeService(@Qualifier("employee") EmployeeBean employeeBean) {
//    public EmployeeService(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }

    public EmployeeService() {
    }


    public EmployeeBean getEmployeeBean() {
        return employeeBean;
    }

    @Autowired
    public void setEmployeeBean(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }


}
