package day28;

public class E03 {

    public static void main(String[] args) {

        String str = "Java is easy";
        getNumOfCharsInString(str);// 12

        String st = "";
        getNumOfCharsInString(st);// 0

        String s = null;
        getNumOfCharsInString(s);// NullPointerException ==> Runtime Exception

    }

    public static void getNumOfCharsInString(String s){

        try {
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.err.println(e.getMessage() + " length() method was used with null String");
        }
    }
}
