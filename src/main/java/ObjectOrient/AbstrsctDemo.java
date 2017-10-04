package ObjectOrient;

/**
 * Created by muthuselvan on 7/14/17.
 */

abstract class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();

}

class MyBook extends Book {
     int price ;

    public MyBook(String title,String author,int price) {
        super(title,author);
        this.price=price;
    }

    @Override
    void display() {
        System.out.print(this.price);
        System.out.print(this.title);
        System.out.print(this.author);

    }
}

public class AbstrsctDemo {

    public static void main(String[] args) {


        Book book = new MyBook("angularjs", "pearl", 100);
        book.display();

    }
}
