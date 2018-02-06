package SpringDemo.SpringAWForSetter.AnnodationWithoutBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PayrollDept {


    @Value("2000")
    private String devSalary;

    @Value("2000")
    private String manSalary;


    @Autowired
    private CompanyName companyName;


    public String getCmpName() {
        return cmpName;
    }

    @Autowired
//    public void setCmpName(@Value("GoogleA") String cmpName) {
    public void setCmpName(@Value("#{companyName.getCompanyName()}") String cmpName) {
        this.cmpName = cmpName;
    }

    private String cmpName ;


    @Autowired
    private ImplDeveloper implDeveloper;

    @Autowired
    private ImplManager implManager ;





    public ImplDeveloper getImplDeveloper() {
        return implDeveloper;
    }

    public ImplManager getImplManager() {
        return implManager;
    }



    public String getDevSalary() {
        return devSalary;
    }




    public void setImplDeveloper(ImplDeveloper implDeveloper) {
        this.implDeveloper = implDeveloper;
    }


    public void setImplManager(ImplManager implManager) {
        this.implManager = implManager;
    }


    @Autowired
    public void setDevSalary(@Value("10020") String devSalary) {
        this.devSalary = devSalary;
    }

    public String getManSalary() {
        return manSalary;
    }


   @Autowired
    public void setManSalary(@Value("20000") String manSalary) {
        this.manSalary = manSalary;
    }







//    public String getManagerSalary() {
//        return implManager.getSalary();
//    }
//
//
//    public void setDevelperSalary() {
//
//    }
//
//    public void setManagerSalary() {
//
//
//    }
//
//    public String getDeveloperSalary() {
//        return implDeveloper.getSalary();
//    }






}
