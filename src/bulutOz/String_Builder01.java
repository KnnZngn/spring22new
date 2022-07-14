package bulutOz;
/*
1.String builder mutable dir yani changeable, String değiştrlmdgndn bazı durmlarda bnu kullanrz
2.String builder  multi safe thread değildr, yani synchronized değildir, threadlı işlemde kulllanılmamalı
3. hem güveli hem mutable istersek String Buffer tercih edilir
4. syntax lı obje gbdr, 3 şekilde oluşturulablr
     i  StringBuilder sb1 = new StringBuilder();  boş tutarsak hafızada 16 harflik yer kaplar
     ii  StringBuilder sb1 = new StringBuilder("animal"); direk obje yazablrz
     iii  StringBuilder sb1 = new StringBuilder(5); veya uzunluyk vereblrz ki bu ençok terch edlndr
5. append metoduyla ekleme yapablrz dolayısıyla stringmz atama yapmasak bile değişir mutable olur
6. obj. ile append(), delete(),reverse(),compare(), clon() , insert() var,
   NOT:substring() de var kullanr ama atama yapmadan değştrmz, cünkü substring normal string gbi davranr atama yapmazsak değşmz. 35. video 13. dk
7. toString() ile normal stringe döner ve .dot ile normal string metotlarnı kullanrz ve İMMUTABLE olur atama yapmadkça değşmz
7. equals metodu> sb1:"java", str:"java, olsun. sb1.equals(str)  false verir true vermez. cnkü builderString ile normal string hç bi şekilde eşt değl
> devamı sb1==str  ==  eşit eşit mükemmleiyetçdr equals ın kabul etmedğni o asla kabl etmez çalşmaz hata verir kızarr
*/
public class String_Builder01 {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder();  //1. şekil
        StringBuilder sb2= new StringBuilder("Java is great program" );  //2. şekl
        StringBuilder sb3= new StringBuilder(10); // hemen capasity i kendi yazdı // 3. şekil

        System.out.println(sb1.length());  // 0
        System.out.println(sb1.capacity()); // 16  otomatik 16 lık yer ayırır
        System.out.println(sb2.capacity());  // 37
        System.out.println(sb3.capacity());  // 10

        //append() metoduyla String e ekleme yapablrz. obj.append()  bir sürü append i .dot ile ekleyblrz. concat metodu gbi
        sb1.append("Java").append(" ").append("is").append(" ").append("funny");
        System.out.println(sb1); // Java is funny
        System.out.println(sb1.capacity());  // 16 yı geçmedgmzden hala 16, 13 karakter olmasına rağmen

        sb1.reverse();  //  reverse metodu var
        System.out.println(sb1);  //ynnuf si avaJ

        System.out.println(sb1.delete(0,5)); // 0 5 arasını siler. delete()   si avaJ
        System.out.println(sb2.compareTo(sb1));  // ascii ye göre kaç brmlk fark var onu görür. aynı olursa 0 yazdrr

// insert() ne yapar? içine koy, araya yerleştir demek, offset ister neresi yani,NE İSTERSEK yerleştrr
        System.out.println(sb2.insert(5,9));  // 5. index ten sonra 9 u ekledi,  (5, index e 9 u yerleştir veya ne yerleştrcksk) 35. vdeo 14 dk 6. soru

    }
}
