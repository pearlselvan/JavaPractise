package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;


import org.springframework.context.annotation.Bean;

public class ImplLaptop implements InterfaceDevice{
    @Override
//    @Bean("implLaptop2")
    public void start() {
        System.out.println("Starting Labtop");
    }
}
