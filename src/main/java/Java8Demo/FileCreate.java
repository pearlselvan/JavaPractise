package Java8Demo;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 * Created by muthuselvan on 5/22/17.
 */
public class FileCreate {

    public FileCreate() {
    }


//    public void copyTemplate(String soruce,String destination) {
    public void copyTemplate() {

        ClassLoader localClassLoader = this.getClass().getClassLoader();
        File file = new File(localClassLoader.getResource("templates/report/index.html").getFile());
        System.out.println(file.getAbsoluteFile().toString());
        System.out.println(file.exists());

        Path sourcePath = Paths.get(file.getAbsoluteFile().toString());
        Path destinationPath = Paths.get("/Users/muthuselvan/Development/question.txt");


        try {
            Files.copy(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch(FileAlreadyExistsException e) {
            //destination file already exists
        } catch (IOException e) {
            //something else went wrong
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {

        FileCreate fileCreate = new FileCreate();
        fileCreate.copyTemplate();

//        Path source = Paths.get("/Users/muthuselvan/Development/question.txt");
//
//
//
//
//
//        String question = "To be or not to be?";
//
//        Files.write(source, question.getBytes());
//
//        Path destinationPath = Paths.get("/Users/muthuselvan/Development/question1.txt");







    }


}
