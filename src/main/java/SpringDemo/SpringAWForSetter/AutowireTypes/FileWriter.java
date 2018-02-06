package SpringDemo.SpringAWForSetter.AutowireTypes;

public class FileWriter implements LogWriterInterface {
    @Override
    public void write(String text) {
        System.out.println("Writting into file : " +text);
    }
}
