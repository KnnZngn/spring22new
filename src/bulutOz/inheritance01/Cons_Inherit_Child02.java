package bulutOz.inheritance01; //super(); = constructor call
//super. keywordu ise parenttan variable çağırır
public class Cons_Inherit_Child02 extends Cons_Inherit_Parent01 {
    Cons_Inherit_Child02() { // default consructor hidden dir
        super(); // default super(); hiddendir ilk satırda ve bzi babaya gönderir
        System.out.println("(0 sıfır)Child02 class parametresiz cons. executed");
        // baba ya paren a gidebilmesi içn baba evinin uygun access modifier a sahip olması lazım
        // yani parent, baba constructor başına protected ya da public yazmalıyız başka package de ise
    }
    Cons_Inherit_Child02(int s) {

        // super();// tüm child cons ta super vardır obje hangsni çalıştrrsa o cons,tan başlar başlar
        //super(num1, num 2); in içinde hangi parameter varsa baba class ta o cons,a gider onu çalıştırır
        //gittiği clasın constructoru uygın access li olmalı
        //obj parametresiz olursa baba da otomatik parametresizi çalştrr
        System.out.println("(int s)Child02 with parameter cons executed");
    }
    Cons_Inherit_Child02(int sayı1, int sayı2){
        super(sayı1, sayı2); // baba nın const undan 2 parametreli olana gider dğrlerini çalştrmz
        // baba,yani parent ta 2 parametreli const olmazsa hata verir.CTE
        System.out.println("(2'li) child02 with 2 parameter executed");
    }

    public static void main(String[] args) {
        Cons_Inherit_Child02 chld2 = new Cons_Inherit_Child02(7,9);// kendi class mızın  obj sni oluşturduk
    //Bu sefer 2. olarak 2 parametreli çalışck çnkü objeye 2 parametre yazdkk
    }

}
