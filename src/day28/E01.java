package day28;

public class E01 {

    /*
        1)Exception is un-expected issue
        2)There are 2 ways to work with Exceptions
            i)Throw Exception ==> Ask help
            ii)Handle Exception ==> Do it by yourself without asking help
        3)Mainly, there are 2 types of Exceptions
            i)Runtime Exceptions ==> You will see them after clicking on "run" button
            ii)Compile Time Exception ==> You will see them while you type your code
     */
    public static void main(String[] args) {

        divide(12, 3);// 4
        divide(0, 3);// 0
        divide(12, 0);// ArithmeticException

    }

    public static void divide(int a, int b){

        try {

            System.out.println(a / b);

        }catch(ArithmeticException e){

            System.out.println("A math rule was broken");
            System.err.println(e.getMessage());// ==> / by zero
            e.printStackTrace();// ==> / by zero

        }

    }

}
