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
/*
car2.numberOfGears(); CTE verdi
çünkü method için önce data türünün
class ına gideriz yani baba veya dede
hangisi yazılmışsa
örnek:
Parnt v1=new Chld();  için
önce parent a bakarız hem orda varsa ve
hem chil de varsa OVER RİDİNG olmuştur
Child i alırız baba yı ezeriz
2.paren ta yok child da varsa CTE
verir çnkü data type takni kullnmlyz
yoksa hata olur
 */
