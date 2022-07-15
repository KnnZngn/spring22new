package bulutOz.OverRiding;

public class OverRidingParent {

    public static void method1() {// static obje olmadan main içinde çalışır, static değilse obje ile çağırablrz yoksa Cte verir
        System.out.println("Parent class method1()");
    }

    public static void method2() {// static obje olmadan main içinde çalışır, static değilse obje ile çağırablrz yoksa CTE verir
        System.out.println("Parent class method2()");
    }
    public void method3(){
        System.out.println("Parent class method3() obje(variable) ile çağırılabilir");
    }
    public void method4(){
        System.out.println("Parent class method4() obje(variable) ile çağırılabilir");
    }

}
