package SpringDemo.SpringAWForSetter.AnnodationWithoutBean;

import org.springframework.stereotype.Component;

@Component("companyName")
public class CompanyName {

    public String getCompanyName() {
        return "Google-Apple";
    }
}
