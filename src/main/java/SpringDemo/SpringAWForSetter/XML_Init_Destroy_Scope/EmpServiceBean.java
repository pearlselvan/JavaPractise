package SpringDemo.SpringAWForSetter.XML_Init_Destroy_Scope;

/**
 * Created by muthuselvan on 11/11/17.
 */
public class EmpServiceBean {

    @Override
    public String toString() {
        return "EmpServiceBean{" +
                "name='" + name + '\'' +
                '}';
    }

    String name ;


    public void init_Methond() {
        System.out.println("Creating when object created ..");
        System.out.println("Emp Object : " +this);
    }

    public String getName() {
        return name;
    }

    public void destroy_Method() {
        System.out.println("Creating when object destroyed ..");
        System.out.println("This destroy method will not called when object in singletoo \n so plesse " +
                "change scope as protopty in beans.xm; to print this stmt " +
                "");
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpServiceBean(String name) {

        this.name = name;
    }


    public EmpServiceBean() {
    }
}
