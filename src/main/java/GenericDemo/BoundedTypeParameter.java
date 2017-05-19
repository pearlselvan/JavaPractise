//package GenericDemo;
///**
// * Created by muthuselvan on 5/16/17.
// */
//public class BoundedTypeParameter    {
//    public static void main(String[] args) {
//        Browser<String> ff = new Firefox();
//
//        ff.InitBrowser("FF");
//    }
//}
//
//interface  Browser<T> {
//     void initDriver(String browsername) ;
//}
//
//class GenericBrowser < T extends Browser> {
//
//
//}
//
//class InitBrowser<T extends DataType> {
//
//    void initBrowser(T a, String name) {
//        a.initDriver(name);
//    }
//
//}
//
//class Firefox implements Browser<String> {
//
//    Browser browser ;
//    @Override
//    public void initDriver(String browsername) {
//        System.out.println("Browser name " +browsername);
//    }
//}
//
//class Chrome implements Browser{
//   @Override
//    public void initDriver(String browsername) {
//        System.out.println("Browser name " +browsername);
//    }
//}
//
//class IE implements Browser {
//    @Override
//    public void initDriver(String browsername) {
//        System.out.println("Browser name " +browsername);
//    }
//}
//
//class Safari implements Browser {
//    @Override
//    public void initDriver(String browsername) {
//        System.out.println("Browser name " +browsername);
//    }
//}
