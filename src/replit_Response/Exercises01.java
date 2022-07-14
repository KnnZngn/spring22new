package replit_Response;

import java.util.Scanner;

public class Exercises01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please give your name");
        String name= scan.next();
        String n1=name.substring(0,1);
        String n2=name.substring(1,name.length());
        n2=n2.replaceAll("\\w","*");
        String n3=n1+n2;



        System.out.println("Please give your surname");
        String surName= scan.next();
        String s1=surName.substring(0,1);
        String s2=surName.substring(1,name.length());
        s2=s2.replaceAll("\\w","*");
        String s3=s1+s2;

        System.out.println("Please give your creditNumber");
        String creditNumber= scan.next();
        String c1=creditNumber.substring(0,12); // 0* 1* 2* 3* 4* 5* 6* 7* 8* 9* 10* 11*     0 dan 12 ye kadar gdck 12 ve sonrası harç
        c1=c1.replaceAll("\\d","*");
        System.out.println("ilk 12 hane  "+c1); // * * * * * * * * * * * *    12 tane yıldız var
        String c2=creditNumber.substring(12,creditNumber.length());  // 12* 13* 14* 15*  // 12 den sona  kadar gdck 12 dahil
        System.out.println("son 4 hane   "+c2);  // 3456
        String c3=c1+c2;
        System.out.println(c3);   //  **** **** **** 3456   12 yıldız + 4 hane
        String starFullName= (n3+ " "+ s3).toUpperCase();



        if(c3.length()==16){
            System.out.println("Dear: "+ starFullName);
            System.out.println("Your number is enough length: "+ c3);
        }else{
            System.out.println("Dear: "+ starFullName);
            System.out.println("Your number is  not enough length, please give a number again");

        }
    }

}
/*

     */