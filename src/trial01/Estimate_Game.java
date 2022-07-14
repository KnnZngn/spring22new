package trial01;

import java.util.Random;
import java.util.Scanner;

public class Estimate_Game {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rNum = rnd.nextInt(100);  // kaç yazarsak onu verir
        //  System.out.println(num);  sil

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a number to estimate between 0 to 100 range of number.");  // bu bir kere ekrana gelecek
        //int estimate= scan.nextInt();
        int counter = 0;
        int estimate = 0;

        while (rNum != estimate) {  // random eğer eşit değilse estimate ye her seferinde bunu yazdır
            System.out.println("Please  give a number.");  // bu devamlı ekrana gelecek
            estimate = scan.nextInt(); // basına tekrar DT yazmamıza gerek yok hata vereir

            if (estimate < rNum) {
                System.out.println("small please enter big number");


            } else if (estimate > rNum) {
                System.out.println("big please enter small number");

            }
            counter++;
        }

        System.out.println("holded number " + estimate + ": you can find " + counter + " trial.");


    }
}
