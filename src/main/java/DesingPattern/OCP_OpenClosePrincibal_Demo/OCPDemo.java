package DesingPattern.OCP_OpenClosePrincibal_Demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.udemy.com/design-patterns-java/learn/v4/t/lecture/8109050?start=1035
public class OCPDemo {

    public static void main(String[] args) {
        List<Product> productList =
                List.of(
                new Product("Apple",Color.RED,Size.SMALL),
                new Product("Car",Color.RED,Size.LARGER),
                new Product("House",Color.BLUE,Size.LARGER)
        );


//        productList.forEach(out-> System.out.println(out));

//        productList.stream().filter(w->w.color == Color.BLUE).forEach(out-> System.out.println(out));

        System.out.println("Old #### Filter Applied : ");
        ProductFilter productFilter = new ProductFilter();
        productFilter.filterByColor(productList,Color.RED).forEach(out-> System.out.println(out));

        System.out.println("Better #### ColorSpecification");

        BetterFilter betterFilter = new BetterFilter();
        betterFilter.filter(productList,new ColorSpecification(Color.RED)).forEach(out-> System.out.println(out));

        System.out.println("Better #### SizeSpecification");
        betterFilter.filter(productList,new SizeSpecification(Size.LARGER)).forEach(out-> System.out.println(out));


        System.out.println("Better #### Both Color and Size");
        betterFilter.filter(productList,new AndSpectificaiton(new ColorSpecification(Color.RED),new SizeSpecification(Size.LARGER)));


    }
}




enum Color {
    RED , BLUE, GREEN
}

enum Size {
    SMALL , MEDIUM , LARGER
}

class Product {

    String name ;
    Color color ;
    Size size ;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product => {" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}


/*
  ProductFilter is not satisfied the OCP because if we need more
  condition ( Ex : Filter by price ) then we need to modify this class
  but OCT state that once written we can extend the class for modification
  but changing the same class is not good as it affecting testing also if we
  distributed the code then changes may affect end user

  Solution : what we will do ?
  Create the Generic interface Specification which will accept and check any product
 */

class ProductFilter {

    public Stream<Product> filterByColor(List<Product> productList, Color color) {
        return productList.stream().filter(p -> p.color == color);

    }

    public Stream<Product> filterBySize(List<Product> productList , Size size) {
        return productList.stream().filter(product -> product.size == size);
    }


//    public Stream<Product> filterByColorAndSize(List<Product> productList , Size size,Color color) {
//        return productList.stream().filter(product -> product.size == size) && (productList.stream().filter(p -> p.color == color));
//    }

}


/*
   Using OCP
 */

/* This interface will accept any product and check the product meet the any specification
   Ex :
 */

interface SpecificaitionInterface<T> {
    boolean isSatisfied(T item);
}

interface FilterInterface<T> {
    Stream<T> filter(List<T> item,SpecificaitionInterface<T> specificaitionInterface);

}


class SizeSpecification implements SpecificaitionInterface<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size == size ;
    }
}

class ColorSpecification implements SpecificaitionInterface<Product> {

    private Color color ;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.color == color;
    }
}


class AndSpectificaiton implements  SpecificaitionInterface<Product> {

    private SpecificaitionInterface<Product> first , second ;

    public AndSpectificaiton(SpecificaitionInterface<Product> first, SpecificaitionInterface<Product> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}


// This class will not be changed if you want to implement difference specification then crate the class
// Ex : PriceSpecifcaion the pass that into filter method
class BetterFilter implements  FilterInterface<Product> {
    @Override
    public Stream<Product> filter(List<Product> productList, SpecificaitionInterface<Product> specificaitionInterface) {
        return productList.stream().filter(p -> specificaitionInterface.isSatisfied(p));
    }
}
