package ObjectOrient;

import org.aeonbits.owner.ConfigFactory;

public class ServerConfigMain {

    public static void main(String[] args) {

        ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
        System.out.println("Server " + cfg.hostname() + ":" + cfg.port() +
                " will run " + cfg.maxThreads());
        System.out.println(cfg.login_xpath());


    }
}
