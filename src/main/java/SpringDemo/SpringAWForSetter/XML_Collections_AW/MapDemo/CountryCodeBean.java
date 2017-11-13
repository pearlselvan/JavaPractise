package SpringDemo.SpringAWForSetter.XML_Collections_AW.MapDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muthuselvan on 11/12/17.
 */
public class CountryCodeBean {

    @Override
    public String toString() {
        return "CountryCodeBean{" +
                "hashMap=" + hashMap +
                '}';
    }

    private Map<String,String> hashMap = new HashMap<>();

    public CountryCodeBean() {
    }

    public Map<String, String> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<String, String> hashMap) {
        this.hashMap = hashMap;
    }
}
