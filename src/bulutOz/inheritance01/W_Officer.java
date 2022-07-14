package bulutOz.inheritance01;

public class W_Officer extends W_Personall {
    public static void main(String[] args) {
        W_Officer objOfc=new W_Officer();
        objOfc.surName= "Halley";
        objOfc.address= "Florida";
        System.out.println(objOfc.address);
        objOfc.name="";
    }

}
