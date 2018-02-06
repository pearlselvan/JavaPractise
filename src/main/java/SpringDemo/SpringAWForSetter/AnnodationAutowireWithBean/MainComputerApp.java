package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainComputerApp {

    public static void main(String[] args) {
//
//        ImplDesktop implDesktop = new ImplDesktop();
//        ImplLaptop implLaptop = new ImplLaptop();
//
//        Computer computer = new Computer();
//        computer.setDevice(implDesktop);
//        computer.startDesktop();
//
//        computer.setDevice(implLaptop);
//        computer.startLabtop();

        ApplicationContext context = new FileSystemXmlApplicationContext("RobotAnnodation.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeanClass.class);
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(UserBean.class);

        Computer computer1 = (Computer) context.getBean("computer");
//        computer1.startDesktop();
        computer1.startLabtop();

        ((FileSystemXmlApplicationContext) context).close();



    }
}
