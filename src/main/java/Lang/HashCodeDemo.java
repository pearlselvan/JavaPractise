package Lang;

/**
 * Created by muthuselvan on 5/6/17.
 *
 *
 * for every object there will be unique number generated thats called hashcode
 * what is need ?
 *
 * when inserting object in hasing data structure jvm will use hashcode
 *
 *
 * |----------------|
 * |                |100----> Each one is bucket
 * |----------------|
  *|----------------|
 * |                |101
 * |----------------|
 * |----------------|
 * |                |102
 * |----------------|
 * |----------------|
 * |                |103
 * |----------------|
 *
 *  if objectA hashcode in 101 then the object will store in bucket : 101
 *
 *  Big is o(1)
 *
 *  public native int hashcode() -> This will generate hashcode basedon address of the object and
 *  it does't mean hashcode represent address
 *
 *  proper way of overriding : store all employee object based on empid
 *  public int hashcode() {
 *      return empid;
 *  }
 *
 */
public class HashCodeDemo {




    public static void main(String[] args) {

        Object o = new Object();

        HashCodeVsToString hashCodeVsToString = new HashCodeVsToString(10);
        System.out.println(hashCodeVsToString);
        // The above print Lang.HashCodeVsToString@a , why a mean hex decimal of 10
        // hex decimal mean divide into 16 , Ex : hex deciamal for 100 is 64

    }


}

//Object class toString methon call object's class hashcode internall if you are not overriding hashcode in
//you class
class HashCodeVsToString {

    int data;

    public HashCodeVsToString(int data) {
        this.data = data;
    }

    public int hashCode() {
        return data;
    }
}
