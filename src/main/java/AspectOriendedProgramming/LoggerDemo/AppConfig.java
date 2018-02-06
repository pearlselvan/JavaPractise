package AspectOriendedProgramming.LoggerDemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

    @Bean
    public Runner runner() {
        return new Runner();
    }


    @Bean
    public Logger logger() {
        return new Logger();
    }
}
