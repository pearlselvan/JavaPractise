package SpringDemo.SpringAWForSetter.AutowireTypes;

public class ConsoleWriter implements LogWriterInterface {
    @Override
    public void write(String text) {
        System.out.println("Console Writting : " +text);
    }
}
