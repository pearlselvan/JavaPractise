package AspectOriendedProgramming.LoggerDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("logger")
public class Logger {

    public void logger() {
        System.out.println("Run Triggered");
    }
}
