package SpringDemo.SpringAWForSetter.AnnodationWithoutBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "SpringDemo.SpringAWForSetter.AnnodationWithoutBean")
public class AppConfiguration {

    @Bean
    public ImplDeveloper implDeveloper(){
        return new ImplDeveloper();
    }

    @Bean
    public ImplManager implManager() {
        return new ImplManager();
    }
}
