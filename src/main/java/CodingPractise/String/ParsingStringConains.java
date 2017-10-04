package CodingPractise.String;

/**
 * Created by muthuselvan on 8/7/17.
 */
public class ParsingStringConains {

    public static void main(String[] args) {

        String report="PDF Report URL: \n" +
                "https://citrix.reporting-01.perfectomobile.com?externalId[0]=exec1@citrix.com_RemoteWebDriver_17-05-18_23_16_51_7825&timestamp=1495149412005";


         if (report.contains("PDF Report URL:")) {
             System.out.println("Found Perfecto URL" +report.split(":")[1]+report.split(":")[2]);

         } else {
             System.out.println("No Found Perfecto URL");
         }

    }

}
