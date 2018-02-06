package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RobotMain {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("RobotAnnodation.xml");
        Robot robot = (Robot) context.getBean("robo");
        robot.speak();

    }
}
