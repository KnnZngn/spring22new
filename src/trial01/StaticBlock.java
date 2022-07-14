package trial01;

public class StaticBlock {
    public static int age;       //--------STATIC BLOCK-----mainden önce çalışır initialize değeri atar. 1 den fazla olursa sırayla çalışır

    static {  // yerinin önemi yok ilk önce static block çalışır
        System.out.println("Static block 1 çalıştı"); //1 .sıra static block çalıştı ve yazdı age e initial değeri atadı
        age = 24;  //2 .sıra  age e initial değeri atadı, age artık 24
    } // 3. sıra scope bitti

    static {
        System.out.println("Static block 2 çalıştı");  // 4. sıra sout a yazdırdı
        age = 23;  // 5. sıra age verable yeni değer olarak 23 atadı age artık 23
    }// 6. sıra scope bitti. motor main öncesi hazırlıklar tamm static block ların işi bitti main e dön

    public StaticBlock() { //10. sıra obje ile buraya geldik ve işleme sırayla başlıyoruz
        //super(); burda super yazarsa ve classmz extends ise parent a gider babayı çalıştırıp  sonra buraya döneriz
        //super(); burda super yazarsa ve classmz extends ise parent a gider babayı çalıştırıp  sonra buraya döneriz
//this(); içinde olduğu class için geçerli, super(); ise babaya yani parent a bizi götüren levha
        //37. video 1.05. dk ve 1.23 arası ----------super(); CODE READİNG------
        //super. keyword u ise parent tan ---variable ve method--- çağırır.
        // 37. video dk 1.25------
        //this.num1 aynı class ta num1 i arar bulur. yoksa parent a gidebilir super gibi
        //super.num1 ise parent class ta num1 i arar bulur.bulamazsa hata verir dk 1.25
        System.out.println("Constructor boş çalıştı"); //11. sıra sout u yazdırdı
        System.out.println(++age);  // 12. sıra age 24 tü değerini bir artıracak age artık 25
    }// 13. sıra scope (şumül) bitti tekrar psvm ye main e dönecek

    public static void main(String[] args) {  // 0. sıra main i motoru çalıştırmadan araç kontrolu için boş static bloklara sırayı verdi. Main metodun içine static block oluşturulamaz
        System.out.println("Main method çalıştı"); //7. sıra main in ilk işemini sırayla yaptack ve yazdırdı
        System.out.println(++age); // 8. sıra 23 olan age i 1 artıracak ve age artık 24 oldu
        StaticBlock obj = new StaticBlock(); // 9. sıra obje oluşmuş , bizi varsa boş veya default constructor a yönlendirecek
        //9. sıra devam obje olmasa constructor çalışmaz oraya gidemeyiz. şimdi cons() a gidelim ve orayı çalıştrlm
        System.out.println("Main method 2 çalıştı"); // 14. sıra soutu yazdıracak
        //15. sıra scope tamamiyle bitti  OUTPUT AYNEN AŞAĞIDAKİ GİBİ

                                            /*Static block 1 çalıştı
                                       Static block 2 çalıştı
                                          Main method çalıştı
                                                 24
                                           Constructor boş çalıştı
                                                  25
                                        Main method 2 çalıştı
                                                                    */
    }
}