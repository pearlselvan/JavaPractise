package SpringDemo.SpringAWForSetter.XML_Collections_AW;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by muthuselvan on 11/12/17.
 */
public class JungleMainApp {


    public static void main(String[] args) {
//        Animal lion = new Animal("Lion","Lion_Type");
//        Animal elephant = new Animal("Elephant","Ele_Type");
//        Animal monkey = new Animal("Monkey","Monkey_Type");
//        List<Animal> animalList = new LinkedList<>();
//        animalList.add(lion);
//        animalList.add(elephant);
//        animalList.add(monkey);
//        Jungle jungle = new Jungle(animalList);
//        System.out.println(jungle);
        ApplicationContext context = new FileSystemXmlApplicationContext("Jungle_Animal_Bean.xml");

        Jungle jungle = (Jungle) context.getBean("jungle");
        System.out.println("Jungle : Bean " +jungle);
        System.out.println("Largest Animal :  " +jungle.getFindLargestAnimal());



        ((FileSystemXmlApplicationContext) context).close();


    }
}
