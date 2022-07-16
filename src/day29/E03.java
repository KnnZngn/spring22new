package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day29/TextFile01");

            int i = 0;

            while((i = fis.read()) != -1){
                System.out.println((char)i);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
