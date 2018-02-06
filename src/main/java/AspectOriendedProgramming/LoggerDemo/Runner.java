package AspectOriendedProgramming.LoggerDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("runner")
public class Runner {



    public void run() {
        System.out.println("Execution started ..");
    }
}
