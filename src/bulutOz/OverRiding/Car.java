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
/*
Method larda ise overriding devreye girer. yani Constructor() ı mız hangi class ise
oranın metodunu kullanırız, babamız kim olursa olsun farketmez. variable kullanımının tersi bir
işleyiş söz konusu, data türü car consructor corolla() ise
NOT: DATA TÜRÜ CHİLD LARDAN SE Çİ LE MEZ
1  önce kendi class ıma bakarım
2. bulamazsam bir üste orda da bulamazsam dede ye bakarım
3. hiç bi yerde yoksa zaten cte verir

İŞTE BURADA -------OVERRİDİNG--------- DEVREYE GİRER 40. VİDEO 48. DAKİKA

1. parent class taki bir method u child içine de yazmak isteyeblrz,
örneğin engine(); methodu

 */