package bulutOz.inheritance01;

public class P_Parent01 {
    public static String name="Neval"; // static yapmazsak variable ı başka yerden çağıramayız
    public static String surName="Ulker";
    protected static String factory="Star";

    public static void method01(){
        System.out.println("method01");
    }
    protected static void method02(){ // methodları da static yapmamız lazım ki başka  class larda kullanabilelim
        System.out.println("protected method");
    }
}
