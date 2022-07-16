package day29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E04 {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day29/TextFile01"));

            String line = br.readLine();

            while(line != null){

                System.out.println(line);

                line = br.readLine();
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
