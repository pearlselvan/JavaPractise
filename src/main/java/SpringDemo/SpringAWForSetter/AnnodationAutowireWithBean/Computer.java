package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {

    @Autowired(required = false)
    @Qualifier("implDesktop1")
    private InterfaceDevice implDesktop;



    @Autowired
    @Qualifier("implLaptop2")
    private InterfaceDevice implLaptop;




    public void setImplDesktop(InterfaceDevice implDesktop) {
        this.implDesktop = implDesktop;
    }



    public void setImplLaptop(InterfaceDevice implLaptop) {
        this.implLaptop = implLaptop;
    }


    public void startDesktop() {
        implDesktop.start();
    }

    public void startLabtop() {
        implLaptop.start();
    }






}
