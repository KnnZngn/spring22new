package bulutOz.inheritance01;
//37. video 17. dakika super(); ve çalışma sırası code reading

public class Cons_Inherit_Child01 extends Cons_Inherit_Parent01 {
Cons_Inherit_Child01(){  // default cons u görünr yaptk
    super(); // biz yazmasak bile extends li consructor altında super vardır ve
    // çalışmaya baba evinden başlatmaya yarar.
    //UYARI super child da bulunur babayı hatırlatmak için 1. satırda olmalı yoksa ölr
    System.out.println("Child cons executed");
}

    public static void main(String[] args) {
        Cons_Inherit_Child01 chld1=new Cons_Inherit_Child01(); // objemiz
    /* soru şu psvm den çalışmaya başladgmda objem child in yani kendi clasının,
    cons unu mu çalıştıracak yoksa gidip parent in cons unu mu çalıştrck
    CEVAP 2 side çalışacak AMMMMAA önce parent çalışacak SEBEBİ::::EXTEND KULLANAN
    1.Tüm class larda default constructor vardır
    2.Tüm const ların ilk satırında super(); KEYWORD u defaul olarak hidden dir
    NOT super(); CHİLD larda bulunur babayı hatırlatır
    yani constructor call vardır yani parent classın YANİ SUPER classn super()i vardır
    extends deyip inherit ettiğimiz an sistemi önce kendisine çağırır çocuk
    babanın elini öpüp baba evinden başlar
    */

    }

}
