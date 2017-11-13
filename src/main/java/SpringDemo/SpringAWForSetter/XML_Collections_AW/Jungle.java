package SpringDemo.SpringAWForSetter.XML_Collections_AW;

import java.util.List;

/**
 * Created by muthuselvan on 11/12/17.
 */
public class Jungle {

    private Animal largest;
    private List<Animal> animalList ;

    public String getFindLargestAnimal() {
        return findLargestAnimal;
    }

    public void setFindLargestAnimal(String findLargestAnimal) {
        this.findLargestAnimal = findLargestAnimal;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "animalList=" + animalList +
                '}';
    }

    private String findLargestAnimal ;

    public Jungle(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Jungle() {
    }

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
