package trial01;
/*
      *
     * *
    * * *
   * * * *
    int row=5;
        //int col=1;
        String s="";
        for (int i = 0; i <row ; i++) {
            for (int j = row-i; j>1 ; j--) { //-i
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();  // for un sonuna bitmeden
        }



 */


import java.util.Scanner;

public class Star_Tree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row=input.nextInt();
        for(int i=0;i<row;i++){
            for(int space=row-i;space>1;space--){

                System.out.print(" ");
            }
            for(int star=0; star<=i; star++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
