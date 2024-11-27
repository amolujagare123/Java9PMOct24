package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args)  {

        try {
            FileInputStream fis = new FileInputStream("d://amol.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        System.out.println("program ends");
    }
}
