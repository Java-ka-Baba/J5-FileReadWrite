import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        // file read
        String pathName = "resources/sample.txt";
        File file = new File(pathName);
        //read
        FileReader fileReader = null;
        try {
            //opening the stream
             fileReader = new FileReader(file);
             //read
            int data = 0;
            while(data != -1) {
                data = fileReader.read();//reading ascii value
                char character = (char) data;
                System.out.print(character);
            }/*
            count the number of characters in the file
            count the number of words in the file
            */
             //closing the stream
             fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
