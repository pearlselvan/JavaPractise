package CodingPractise;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by muthuselvan on 4/26/17.
 * https://www.careercup.com/question?id=11856466
 * http://www.geeksforgeeks.org/find-last-unique-url-long-list-urls-single-traversal/
 */
public class FindUniqURL {



    public static void main(String[] args) {
        URLList urlList1 = new URLList("Google");
        URLList urlList2 = new URLList("Google1");
        URLList urlList3 = new URLList("Google1");
        URLList urlList4 = new URLList("Google");
        URLList urlList5 = new URLList("Google");

        LinkedList<URLList> listlink=new LinkedList<>();
        listlink.add(urlList1);
        listlink.add(urlList2);
        listlink.add(urlList3);
        listlink.add(urlList4);
        listlink.add(urlList5);

        listlink.forEach(out-> System.out.println(out.getUrlname()));

        Set<URLList> setink = new HashSet<>();
        setink.add(urlList1);
        setink.add(urlList2);
        setink.add(urlList3);
        setink.add(urlList4);
        setink.add(urlList5);



        System.out.println("Using set");

        setink.forEach(out-> System.out.println(out.getUrlname()));

    }




}

class URLList {

    public String getUrlname() {
        return urlname;
    }

    String urlname ;

    public URLList(String urlname) {
        this.urlname = urlname;
    }


}
