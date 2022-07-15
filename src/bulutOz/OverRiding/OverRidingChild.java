package bulutOz.OverRiding;

public class OverRidingChild extends OverRidingParent {

    public static void method1() { // static obje olmadan main içinde çalışır, static değilse obje ile çağırablrz yoksa CTE verir
        System.out.println("Child class parent taki aynı method1() i EZER");
    }
    public void method4(){
        System.out.println("Child çalışır parent method()4 ü EZER OVERRİDİNG");
    }


    public static void main(String[] args) {

        method1(); // CHİLD hangisi çalışır child mi parent mi?
        //child çalışır çünkü burada buldu ve parenti EZDİ OVER-RİDİNG oldu
        method2(); // PARENT burda bulamadı parent a gidecek
        OverRidingChild kid1=new OverRidingChild();
        kid1.method3(); //parent
        kid1.method4(); //child BURDA VAR ÇÜNKÜ

        OverRidingParent kid3=new OverRidingParent();
        kid3.method3();// parent çünkü bu bzm klasik objemz elbette babayı çalıştıracak
        kid3.method4();// parent çünkü bu bzm klasik objemz elbette babayı çalıştıracak


        OverRidingParent kid2=new OverRidingChild(); // OVER RİDİNG olur
        //Data type:PARENT         Constructor() CHİLD class
        kid2.method3(); //parent
        kid2.method4(); //CHİLD parent yazmaz child yazar çünkü overriding oldu
        //parent taki method() 4 ü ezdi



    }

}
/*
----------------OBJ ile method çağırdığımızda---------- Car car1=new Corolla();
1. data type ne ise önce oradan başlayacak, baba,child dede farketmez burda D-T miz Car
2. Boyandığı class ta bulursa kullnacak, bulamazsa bir üste çıkacak orda da yoksa
zaten CTE verir main metod içinde
3. Bulursa kontrol edecek. diyelimli Data type miz dedemiz grandparent olan car
method orda varsa birde babaya gelecek orda da varsa Car da ki method() ezilir OVER-RİDİNG olur
Durmayacak şayet child da da varsa bu sefer 2 si birden ezilecek sadece child i kullanacak
böylelikle child baba ve dede deki aynı metodu aynı sisim ve signature(parametre) ler ile
kullanırsa OVER-RİDİNG yapmış olacak o class lar daki aynı metodu EZECEK

Aynı isimde farklı methodlar oluşturabilmenin 2 yolu var

1. si OVER LOADİNG  f(int x) f(String s) f(int x, int y)
içindeki parametreleri değiştirerek aynı ismde bir sürü method üreteblrz
NOT: Aynı class ta aynı isim ve signature(parameter) de method oluşturamayız
FAKAT: extend li classlarda child ve parent ta aynı isimli ve signature li method olabilir
işte burada devreye OVER RİDİNG girer ve parent takini EZER -GEÇERSİZ KILAR

2. si OVER RİDİNG f() f() child f() methodu parent f() method unu EZER
inheritance de kullanılır extend keyword u ile bağlı class larda yapılablr
parametreleri değiştirmeden nasıl üreteblrz

 */