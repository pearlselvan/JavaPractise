package CodingPractise.String;

/**
 * Created by muthuselvan on 8/15/17.
 */
    public class SplitExample {

    public static void main(String[] args) {

        String mystring="{Name:AppsUpdation,Sheet:Websaas, MapperColumn:WebSaas}";
        String[] bits = mystring.split(":");
        System.out.println(bits[bits.length-1].replace("}",""));



        String perfecto = "PDF Report URL: \n" +
                "https://citrix.reporting.perfectomobile.com?externalId[0]=exec1@citrix.com_RemoteWebDriver_17-08-29_17_38_12_9930&_timestamp[0]=1504028292369";
        System.out.println(perfecto.split("PDF Report URL:")[1]);







    }
}
