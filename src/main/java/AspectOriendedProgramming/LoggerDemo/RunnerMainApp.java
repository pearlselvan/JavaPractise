package AspectOriendedProgramming.LoggerDemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@SpringBootApplication
public class RunnerMainApp implements CommandLineRunner {

    @Autowired
    Runner runner;
    public static void main(String[] args) {
        SpringApplication.run(RunnerMainApp.class,args);

    }

    @Override
    public void run(String... args) throws Exception {
        runner.run();


    }
}
