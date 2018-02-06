package DesingPattern.LiskovSubstituinPrincible;

 /*
   What LSP Says ? You can substiture the derived / child for base / parent class
  */

public class LSPDemo {

    public static void main(String[] args) {


//        Reactagle reactagle = new Reactagle();
//        reactagle.setHeight(100);
//        reactagle.setWidth(200);
//        Square square = new Square(200);
//        square.getArea();

        // width and height
        Reactagle reactagle = new Reactagle(2,3);
        apply(reactagle);
        System.out.println("Reactangle Area : " +reactagle.getArea());


        Reactagle square = new Square();
        square.setWidth(10);
//        square.setWidth(5);
        apply(square);
        System.out.println("Square Area : " +square.getArea());


    }

    static public void apply(Reactagle reactagle) {
        int width = reactagle.getWidth();
        System.out.println("Get width  : " +width);


        reactagle.setHeight(10);
        System.out.println("Get Height  : " +reactagle.getHeight());
        System.out.println("Expected Area " + (width * 10) + " got " +reactagle.getArea());
//        System.out.println("Area of Rectangle : " +reactagle.getArea());





    }


}

class Reactagle {

    @Override
    public String toString() {
        return "Reactagle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int width ;
    int height ;

    public Reactagle() {

    }

    public int getArea() {
        return width * height;
    }

    public Reactagle(int width, int rectangle) {
        this.width = width ;
        this.height = height ;
    }


}
// ============================================

    class Square extends Reactagle {


    protected Square() { }

    protected Square(int side) {
//        width = side ;
//        height = side ;
        width = height = side ;

    }


        @Override
        public void setHeight(int height) {
            super.setHeight(height);
            super.setWidth(height);
        }

        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        public void getArea1() {
        System.out.println(width+ " : " +height);
    }


}
