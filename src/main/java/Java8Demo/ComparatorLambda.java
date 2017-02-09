package Java8Demo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by muthuselvan on 2/8/17.
 */
public class ComparatorLambda {

    public static void main(String[] args) {

        Country USA = new Country("USA");
        Country INDIA = new Country("INDIA");
        Country CHINA = new Country("CHINA");
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(USA);
        countries.add(INDIA);
        countries.add(CHINA);
        //Decending
        countries.sort((o1, o2) -> -o1.getCityName().compareTo(o2.getCityName()));
        //Asecending
//        countries.sort((o1, o2) -> -o1.getCityName().compareTo(o2.getCityName()));
        countries.forEach(out -> System.out.println(out));
    }
}

class Country {

    private String cityName ;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public Country(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                '}';
    }
}
