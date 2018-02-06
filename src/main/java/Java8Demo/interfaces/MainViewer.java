package Java8Demo.interfaces;

import java.util.List;

public class MainViewer {
    public static void main(String[] args) {
        DisplayInterface displayInterface = new Mobile();
        displayInterface.show();
        displayInterface.startPhone();
        DisplayInterface displayInterface1 = new TV();
        displayInterface1.show();
        displayInterface1.powerOn();



    }
}
