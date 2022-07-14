package practice07;

import java.util.Scanner;

public class Q02 {
    //Write a Java method to find the smallest number among three numbers given by user.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double x = scan.nextDouble();
        System.out.println("Enter second number");
        double y = scan.nextDouble();
        System.out.println("Enter third number");
        double z = scan.nextDouble();
        System.out.println( "smallest: "+smallest(x,y,z));

    }
    public static double smallest(double x, double y, double z){

        double result = Math.min(Math.min(x,y),z);

        return result;
    }

}
