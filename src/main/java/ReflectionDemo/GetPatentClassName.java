package ReflectionDemo;

import java.lang.reflect.Field;

/**
 * Created by muthuselvan on 5/18/17.
 */
public class GetPatentClassName {

    public static void main(String[] args) {
//        Field[] fields = ReflectionChild.class.getClass().getDeclaredFields();
//        for (int i=0;i<fields.length-1;i++) {
//            System.out.println(fields[i]);
//        }


        String par= "ReflectionDemo.ReflectionChild";
        Class c = null;
     try {
          c = Class.forName(par);
     } catch (ClassNotFoundException e ) {
         e.printStackTrace();
     }

        ReflectionParent reflectionParent = new ReflectionChild();
        System.out.println(reflectionParent.getClass().getSuperclass().toString());
        System.out.println(c.getClass().getSuperclass().toString());




    }

}

class ReflectionParent {

    public ReflectionParent() {

    }
}

class ReflectionChild extends ReflectionParent {

    public ReflectionChild() {
    }
}
