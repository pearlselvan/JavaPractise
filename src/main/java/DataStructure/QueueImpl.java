package DataStructure;

/**
 * Created by muthuselvan on 2/6/17.
 */
public class QueueImpl {

    int capacity ;
    int front ;
    int rear ;
    int qarray[] ;

    public QueueImpl(int capacity) {
    this.capacity=capacity;
    this.rear = -1 ;
    this.front = 0 ;
    this.qarray = new int[capacity];


    }

    public static void main(String[] args) {


    }
    public void enqueue(int data) {
        this.rear+=1;
        this.qarray[rear]=data;
    }

    public  int dequeue() {

        int frontvalue = this.qarray[this.front];
        this.front+=1;
        return frontvalue;
    }

}
