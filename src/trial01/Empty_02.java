package trial01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Empty_02 {

    public static void main(String[] args) {
        String table[] = {"aa", "bb", "cc"};
        for (String w : table) {
            int ii = 0;
            while(ii< table.length){
                System.out.println(w+", "+ii);
                ii++;

            }
        }

    }
}