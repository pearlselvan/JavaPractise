package SpringDemo.SpringAWForSetter;

import org.springframework.stereotype.Component;

/**
 * Created by muthuselvan on 11/9/17.
 */
@Component
public class EmployeeBean {

    String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
