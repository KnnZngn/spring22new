package bulutOz.OverRiding;

public class Car {
    protected String movement ="The cars moves with wheels"; //gear vits gearbox şanzuman
    protected String speed="The cars make speed according to power of engine";
    protected String fuel="The cars can use different fuels";
    protected String brand="The cars have different brands";

    public void engine(){
        System.out.println("The cars use engine for each different brand");
    }
    public  void fuelConsumption(){
        System.out.println("The cars consume fuel according to variety(type) of fuel and power of engine ");
    }

}
