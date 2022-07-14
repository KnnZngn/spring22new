package bulutOz.OverRiding;

public class Toyota extends Car {
    protected String speed="Toyota vehicles makes max 220 km speed";
    protected String brand="Toyota";
    protected String madeIn="Japan"; //company location

    public void engine(){
        System.out.println("Toyota use Toyota branded engine");
    }

    public void guarantee(){
        System.out.println("Toyota cars have 10 yearly guarantee");
    }

}
