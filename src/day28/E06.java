
package day28;

public class E06 {

    public static void main(String[] args) {
        Object obj = 70;
        convertObjectToString(obj);//ClassCastException ==> Runtime Exception
    }

    public static void convertObjectToString(Object obj){
        try {
            String s = (String) obj;
            System.out.println(s);
        }catch(ClassCastException e){
            System.out.println("Object Class cannot be converted to String Class");
        }finally{
            System.out.println("Break the connection");
        }
    }
}
