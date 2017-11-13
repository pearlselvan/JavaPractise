package SpringDemo.SpringAWForSetter.XMLContextDemo;

/**
 * Created by muthuselvan on 11/10/17.
 */
public class PersonX {

    String name ;

    public AddressX getAddressX() {
        return addressX;
    }

    public void setAddressX(AddressX addressX) {
        this.addressX = addressX;
    }

    private AddressX addressX ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id ;

    @Override
    public String toString() {
        return "PersonX{" +
                "name='" + name + '\'' +
                ", addressX=" + addressX +
                ", id='" + id + '\'' +
                '}';
    }

    public PersonX(String name) {
        this.name=name;
    }


    public PersonX() {

    }

    public void speak() {
        System.out.println("Speaking in tamil" );
    }
}
