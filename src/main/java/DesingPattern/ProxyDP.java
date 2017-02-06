package DesingPattern;

/**
 * Created by muthuselvan on 1/31/17.
 */


/*
       structural ( Controlled access of a functionality )
 */


/*
    Practical use :
    Let’s say we have a class that can run some command on the system.
    Now if we are using it, its fine but if we want to give this program to a client application,
    it can have severe issues because client program can issue command to delete some system files or
    change some settings that you don’t want.

     So we want to implement : The definition itself is very clear and proxy design pattern is used
    when we want to provide "controlled access of a functionality"

    Refff : http://www.journaldev.com/1572/proxy-design-pattern


    Defination 2 :
    In proxy pattern, a class represents functionality of another class.
    In proxy pattern, we create object having original object to interface its functionality to outer world.

    Design Principle :
    The participants classes in the proxy pattern are:

    Subject - Interface implemented by the RealSubject and representing its services.
    The interface must be implemented by the proxy as well so that the proxy can be used in any location where the RealSubject
    can be used.

    Proxy - Maintains a reference that allows the Proxy to access the RealSubject.
    Implements the same interface implemented by the RealSubject so that the Proxy can be substituted for the RealSubject.
    Controls access to the RealSubject and may be responsible for its creation and deletion.
    Other responsibilities depend on the kind of proxy.

    RealSubject - the real object that the proxy represents.

    Reff : http://www.oodesign.com/proxy-pattern.html



 */

public class ProxyDP {

    public static void main(String[] args) {

        CommandExecutor executor = new ProxyCommandExecutor("mselvan") ;
//        CommandExecutor executor = new ProxyCommandExecutor("revanth") ;
        try {
            executor.runCommand("ssh");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}


interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}


class RealObject implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        System.out.println("Executing without Proxy " +cmd);
    }
}

class ProxyCommandExecutor implements CommandExecutor {
    private CommandExecutor commandExecutor ;
    private boolean isAdmin ;
    private static final String USER_NAME = "mselvan";

    public ProxyCommandExecutor(String username) {
        if (username.equals(USER_NAME)) {
            isAdmin = true;
            commandExecutor = new RealObject();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) //  Add if more condition other then admin , ex : admin may not allowed to run rm command in stage
        {
            commandExecutor.runCommand(cmd);
            System.out.println("Executing :" + cmd);
        } else {
            System.out.println("Failed to execute the command due to authorization ");
        }
    }
}
