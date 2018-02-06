package SpringDemo.SpringAWForSetter.AutowireTypes;

public class LoggerByConstructor {

    private LogWriterInterface consoleWriter;



    private LogWriterInterface fileWriter;

    public LoggerByConstructor(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    public LoggerByConstructor() {
    }

    public void setConsoleWriter(LogWriterInterface writer) {
        this.consoleWriter = writer;
    }

    public void setFileWriter(LogWriterInterface fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }

}
