package day28;

public class E04 {

    //1) "try block" cannot be used alone, can be used with 1 or more catch block
    //2) "try block" cannot be used alone, can be used without "catch block" with "finally block"

    public static void main(String[] args) {

        convertStringToIntegerThenDivideByGivenNumber("2314", 2);//1157

        convertStringToIntegerThenDivideByGivenNumber("1a", 3);// NumberFormatException ==> Runtime Exception

        convertStringToIntegerThenDivideByGivenNumber("12", 0);
    }

    public static void convertStringToIntegerThenDivideByGivenNumber(String s, int num){

        try {

            System.out.println(Integer.parseInt(s) / num);

        }catch(ArithmeticException e){

            System.out.println("Issue occurred in division");

        }catch(NumberFormatException e){

            System.out.println("Issue occurred in conversion");

        }

    }
}



