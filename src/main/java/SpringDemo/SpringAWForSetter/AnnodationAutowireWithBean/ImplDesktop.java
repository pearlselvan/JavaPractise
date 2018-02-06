package SpringDemo.SpringAWForSetter.AnnodationAutowireWithBean;


import org.springframework.context.annotation.Bean;


public class ImplDesktop implements InterfaceDevice {
    @Override
    public void start() {
        System.out.println("Starting Desktop ..");
    }
}
