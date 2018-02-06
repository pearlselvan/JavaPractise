package SpringDemo.SpringAWForSetter.AutowireTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainLoggerByName {

    public static void main(String[] args) {



        System.out.println("Using bean");
        ApplicationContext context = new FileSystemXmlApplicationContext("Logger_Beans_ByName.xml");
        LoggerByName logger1 = (LoggerByName) context.getBean("logger");
        logger1.writeConsole("Check me in console ");
        logger1.writeFile("Check me in file");




    }
}
