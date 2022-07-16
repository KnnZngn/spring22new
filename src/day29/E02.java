package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    /*
        1)"throws" keyword is used in method signature line
        2)If you use child and parent after "throws" keyword, Java will let you use just the parent
        3)After "throws" keyword multiple Exceptions can be used
        4)After "throws" keyword, we do not use "new" keyword and "constructor", we use just the Exception Class names

        5)"FileNotFoundException" is thrown by Java if the path is wrong or if the file does not exist
        6)"IOException" handles all issues related with "input" and "output" operations
        7)"IOException" is the parent of "FileNotFoundException"
     */

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day29/TextFile01");
        int i = 0;
        while((i= fis.read()) != -1){
            System.out.print((char)i);
        }

    }
}
