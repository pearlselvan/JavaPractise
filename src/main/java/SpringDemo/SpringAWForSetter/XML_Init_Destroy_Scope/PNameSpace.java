package SpringDemo.SpringAWForSetter.XML_Init_Destroy_Scope;

/**
 * Created by muthuselvan on 11/11/17.
 */
public class PNameSpace {

    String pname ;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "PNameSpace{" +
                "pname='" + pname + '\'' +
                '}';
    }
}
