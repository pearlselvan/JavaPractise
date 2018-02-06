package SpringDemo.SpringAWForSetter.AutowireTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainLoggerByConstructor {

    public static void main(String[] args) {

//        Logger logger = new Logger();
//        FileWriter fileWriter = new FileWriter();
//        logger.setFileWriter(fileWriter);
//        logger.writeFile("Check me in file ");
//        ConsoleWriter consoleWriter = new ConsoleWriter();
//        logger.setConsoleWriter(consoleWriter);
//        logger.writeConsole("Check me in console");


        // Autowiring by type Example


        System.out.println("Using bean");
        ApplicationContext context = new FileSystemXmlApplicationContext("Logger_Beans_ByConstructor.xml");
        LoggerByConstructor logger1 = (LoggerByConstructor) context.getBean("logger");
        logger1.writeConsole("Check me in console ");
        logger1.writeFile("Check me in file");


        // Autowiring by name : Example :





    }
}
