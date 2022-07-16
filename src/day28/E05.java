package day28;

public class E05 {

    /*
        Note: If there is parent-child relationship between Exception Classes and
              you need to use multiple catch blocks make the child first otherwise you will
              Compile Time Error
     */

    public static void main(String[] args) {

        String str = "I love Java";
        getCharacterFromStringByIndex(str, 4);// v

        String st = "I love Java";
        getCharacterFromStringByIndex(st, 12);// StringIndexOutOfBoundsException ==> Runtime Exception

        String s = null;
        getCharacterFromStringByIndex(s, 0);// NullPointerException ==> Runtime Exception


    }

    public static void getCharacterFromStringByIndex(String s, int idx){

        try {
            System.out.println(s.charAt(idx));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Non-existing index was used in the String");
        }catch(RuntimeException e){
            System.out.println("The other one...");
        }finally{
            System.out.println("Break the connection");
        }

    }

}
