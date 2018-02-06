package AspectOriendedProgramming.LoggerDemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AspectClass {

    @Before("execution(* AspectOriendedProgramming.LoggerDemo.Runner.run())")
    public void before() {
        System.out.println("Before start running  this method AspectOriendedProgramming.LoggerDemo.Runner.run ");

    }


    @After("execution(* AspectOriendedProgramming.LoggerDemo.Runner.run())")
    public void after() {
        System.out.println("After  Executed this method ... AspectOriendedProgramming.LoggerDemo.Runner.run");

    }

}
