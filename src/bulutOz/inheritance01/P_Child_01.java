package bulutOz.inheritance01;

//Child_01 extends Parent01  extends i kullanırız
/*
child class hiç bir objeye ihtiyaç duymadan parent class taki method ve
variable lara ulaşablr
 */
public class P_Child_01 extends P_Parent01 {
    public static void main(String[] args) {
        System.out.println(); // psvm static olduğndan içine static olmayanı direk çağıramayız hata verir
        System.out.println(name); // Neval
        System.out.println(surName); // Ulker
        System.out.println(factory);// Star

        method01(); // method01
        method02();  // method02
    }
}
