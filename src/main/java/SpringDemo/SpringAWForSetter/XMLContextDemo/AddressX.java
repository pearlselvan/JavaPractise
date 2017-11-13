package SpringDemo.SpringAWForSetter.XMLContextDemo;

/**
 * Created by muthuselvan on 11/11/17.
 */
public class AddressX {

    private String street ;
    private String zipCode ;

    @Override
    public String toString() {
        return "AddressX{" +
                "street='" + street + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }


    public AddressX() {
    }

    public AddressX(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }



}
