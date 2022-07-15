package lambda_functional_programming;

public class UtilsNt {

    public static void printTheSameLineWithSpace(Object str){

        System.out.print(str+" ");

    }
    public static boolean checkToBeEven(int x){
        return x%2==0;
    }
    public static boolean checkToBeOdd(int x){
        return x%2!=0;
    }
    public static int getSquare(int x){
        return x*x;
    }
    public static int getCube(int x){
        return x*x*x;
    }
    public static double getHalf(int x){
        return x/2.0;
    }
    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }

}
