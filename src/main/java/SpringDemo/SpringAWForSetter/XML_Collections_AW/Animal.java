package SpringDemo.SpringAWForSetter.XML_Collections_AW;

/**
 * Created by muthuselvan on 11/12/17.
 */
public class Animal {

    String name ;
    String type  ;

    @Override
    public String toString() {
        return "Animal { " +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
