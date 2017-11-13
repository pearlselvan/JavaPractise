package SpringDemo.SpringAWForSetter.XML_Collections_AW.MapDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by muthuselvan on 11/12/17.
 */
public class MapMain {

    public static void main(String[] args) {
//        System.out.println("Tests");
//        Map<String,String> city = Map.of("USA","US","INDIA","IND","GERMANU","GER");
//
//        CountryCodeBean countryCodeBean = new CountryCodeBean();
//        countryCodeBean.setHashMap(city);
//        System.out.println(countryCodeBean);


        ApplicationContext context = new FileSystemXmlApplicationContext("Map_Bean.xml");

        CountryCodeBean countryCodeBean1 = (CountryCodeBean) context.getBean("mapex");
        System.out.println("Using bean " +countryCodeBean1);

        ((FileSystemXmlApplicationContext) context).close();




    }
}
