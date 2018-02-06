package ObjectOrient;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:ServerConfig.properties")
public interface ServerConfig extends Config {

    int port();
    String hostname();
    @DefaultValue("42")
    int maxThreads();

    String login_xpath();



}
