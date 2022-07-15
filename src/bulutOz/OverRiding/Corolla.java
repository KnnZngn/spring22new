package bulutOz.OverRiding;

public class Corolla extends Toyota {
    protected String speed="Corolla vehicles makes max 200 km speed";
    protected String fuel="Corolla is petrol(benzin,gasolina) or electric";
    protected String modal="Corolla E23";

    public void engine(){
        System.out.println("Corolla use environment friendly(environmentalist) engine");
    }
    public  void fuelConsumption(){
        System.out.println("Corolla consume 5.6 liter fuel");
    }
    public void numberOfGears(){
        System.out.println("Corolla cars have 6 gears");
    }
//---NOT---Tüm bunlar extend varsa geçerli yani inheritance dede baba çocuk varsa geçerli
    public static void main(String[] args) {
 //1. Corolla car1= new Corolla(); bldğmz obje yeni adı VARİABLE
        Corolla car1= new Corolla();// parentların hepsine car1 obj yeni adı VARİABLE ile ulaşablrm
        System.out.println(car1.movement); //Car dan
        System.out.println(car1.speed);// Corolla kendinden
        System.out.println(car1.fuel);// Kendinden
        System.out.println(car1.brand); // Toyota dan ilk bulduğu yerden
        System.out.println(car1.madeIn); //Toyota dan
        System.out.println(car1.modal);// Kendinden
        car1.engine();
        car1.numberOfGears();
        //2. Toyota car2= new Corolla();  Toyota boyalı Corolla
        // artık data türüm Toyota variable ise car2, corolla ise constructor
        //variablları gdp boyandığı babasından alacak
        //methodlar da önce data türünden başlar bulamazsa sırayla bab dede gidecek
        //eğer kendi classmızda baba ve dededeki ile aynı method varsa
        //mecburan kendi classmzdaki method çalışır
        Toyota car2= new Corolla();
        System.out.println(car2.movement); //Car dan alır kendinde olmasına rağmen alamaz baba boyasıyla boyandı
        System.out.println(car2.speed);// Toyotadan
        System.out.println(car2.fuel);// Kendinden alamaz Car dan
        System.out.println(car2.brand); // Toyota dan ilk bulduğu yerden
        System.out.println(car2.madeIn); //Toyota dan
        //System.out.println(car2.modal);// CTE verir cünkü variable kendinde olsa bile baba boyasıyla boyandığından varsa babadan yoksa deden alacak ve onlarda yok, kendi class ında olmasına rağmen alamıyor
         //car2.numberOfGears(); CTE verdi
        //eğer kendi classmızda baba ve dededeki ile aynı method varsa
        //mecburan kendi classmzdaki method çalışır

        car2.engine(); //overriding edilmiş çnkü kendi class ını kullanacak
         car2.guarantee();
         car2.fuelConsumption();

         //3. Car car3=new Corolla();  Toyota boyalı Corolla
        // artık data türüm Toyota variable ise car2, corolla ise constructor
        //variablları gdp boyandığı babasından alacak
        //methodları önce kendinden bulamazsa sırayla bab dede gidecek
        Car car3=new Corolla();
        System.out.println(car3.movement); //Car dan yani dededen alır kaendinden alamaz
        System.out.println(car3.speed);// Car dan yani dededen alır kaendinden alamaz
        System.out.println(car3.fuel);// Car dan yani dededen alır kaendinden alamaz
        System.out.println(car3.brand); // Car dan yani dededen alır kaendinden alamaz
        //System.out.println(car3.madeIn);// CTE verir cünkü variable kendinde olsa bile dede boyasıyla boyandığından varsa dededen yoksa dededen alacak ve onlarda yok, kendi class ında olmasına rağmen alamıyor
        //System.out.println(car3.modal);// CTE verir cünkü variable kendinde yok dede boyasıyla boyandığından varsa babadan yoksa deden alacak ve onlarda yok, kendi class ında olmasına rağmen alamıyor
        car3.engine();
        //car3.numberOfGears();
        car3.fuelConsumption();
        //car3.guarantee();
    }

}
