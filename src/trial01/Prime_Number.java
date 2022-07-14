package trial01;

import java.util.ArrayList;
import java.util.List;

public class Prime_Number {

     // 100 e kadar sadece kendine bölünen numaraları bulma list ile yap NUMBER PRİME
        // nested loop kullan prime 2 den başlar yani ASAL SAYILAR

        public static void main(String[] args) {

            List<Integer> primeNum = new ArrayList<>();
            int num = 2;
            int counter=0;

            while(num<100){  //nested loop while ve for iç içe
                for(int i=2; i<=num; i++){
                    if(num%i==0){
                        counter++;
                    }
                }

                if(counter==1){
                    primeNum.add(num);
                }
                num++;
                counter=0;

            }

            System.out.println(primeNum); //OUTPUT
// [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]




        }

    }

