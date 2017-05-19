package Lang;

import java.util.Objects;

/**
 * Created by muthuselvan on 5/7/17.
 * We can use equals method to compare the content of the object
 *
 * if our class does't contain equal method then object class equal method will be executed
 *
 *  Double equals for reference comparasion
 *  Equal for object comparasion
 *
 */
public class EqualsDemo {


    public static void main(String[] args) {

        Color apple = new Color("red");
        Color cherry = new Color("red");
        Color mango = new Color("yellow");
        Color bangoloreApple = apple;

        System.out.println(apple==bangoloreApple);
        System.out.println(apple.equals(null)); // if you are overriding the equal (as in below ) then
        //this will return false because that will call object clsaa that wilk check memory address equal not
        // content equals




    }

}

class Color {

    String colorName ;
    public Color(String colorName) {
        this.colorName = colorName;
    }

    public boolean equals(Color sudentBbj) {
        try {
//            this.colorName = colorName;
            Color objColorname = (Color) sudentBbj;
            return colorName == objColorname.colorName;
        }catch (NullPointerException e) {
            return false;
        }

    }



}
