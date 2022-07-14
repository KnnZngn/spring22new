package trial01;
public class ReadCode {
    /*
1. static olan method veya veriabllara class ismi ve .dot ile ulaşabiliriz.yaptgmz atamalar değerler kalıcı olur.
2.  static olmayanlara ve cons lara instance veriabl ve methodlra obj. İle ulaşablrz. Yaptgmz değşklkler ve atamlr atadgmz değerler kalıcı olmaz.
                   ............CONSRUCTOR CALL this();
               parantezli this(); şu parantezli cons'a git demektir. adres çubuğu gbi
            ------------28.   TR video, 1.34. dk cok güzel kod okuma
*/
    int x = 3;  // bunlar benim objem. yani x objesi, y objesi
    int y = 5;  // bu variabllar artık benm objem çnkü obje ile çağrblrm
    ReadCode() {   // 7. sıra // 1. cı constructor boş parametreli cons u bulduk
        x += 1;  // 8. sıra  x artık 4 oldu obje x imiz 4 olarak değişti çnkü atama var
        System.out.println("-x" + x);  // 9. sıra yazdırır OUTPUT : -x4
    }  //10. sıraya geldi bu cons bitti geldgmz this e geri döneriz yani bir önceki this(); in hemen devamına gideriz
    ReadCode(int i) { //5. sıra this(3); beni buraya getrdi. başladım okumaya. elimdeki 3 ü int i ye koydum i=3; i artık 3
        //indim aşağı yine bir this()
        this();// 6. sıra // bu this(); de bizi boş cons a götürecek çnkü parametresiz, cod'umuzun sırasını değştryrlr
        this.y = i;  // 11. sıra, this(); in hemen devamına geldik,
        //y miz yerşetrdğmz 3 e eşt oldu obje olan ilk y miz 5 değl 3 artk
        x += y; //12. sıraya geldik x= x+y yani x=4+3  obje x in yeni değeri 7 oldu. çnkü atama var
        System.out.println("-x" + x); // 13. sıra yazdırdık OUTPUT: -x7
    }  // 14. sıraya geldik bu cons la işimz bitti buraya nerden geldik ona döneriz yani this(3); ün hemen altına
    ReadCode(int i, int i2) { // 3 . sıra objeden gelen 2 değeri buraya yerleştrm i=4 i2=3 oldu
        //hemmen aşağı doğru okurum//3. constructor 2 parametreli
        this(3);  // 4. sıra this(3); levhaya geldim,hangi parametreli ise onu çağırır yani 2. cons agidecek ve 3 ü götürecek ve oraya yerleştrck
        // ve bu üçü parametreye hediye edecek
        this.x -= 4;  //15. sıra x imiz artık 7 x-4=3  x artık 3 ve kalıcı atama var
        System.out.println("-x" + x); //16. sıra yazdırdık OUTPUT: -x3
    } //17. sıra kod bitti
    public static void main(String[] args) {  // 1. sıra code okumaya hep main den başlanır
        ReadCode obj1 = new ReadCode(4, 3); // 2. sıra 2 parametreli cons u bulmalym. code um bu kadar aslında
        //objem 2 parametreli constructoru çağrck. Kodun sırasını da belirler
        //ÇOK ÖNEMLİ KOD okuma-------------------------
        /*
SIRALAMA
1. STATİC BLOCK                               static {         }
2.MAİN METHOD-PSVM                    psvm {         }
3. İNSTANCE BLOCK                         ……..{         }  non-static block
        0. code okumaya psvm den başlarım her zaman kodumuz aslında sadece orası,
        sonra o bizi adresler yönlendirir, şöyle ki:
        1. object içindeki parametrelere bakarım ,hangi constructor a benziyorsa ona giderim
        burdaki 2 tane int olan cons. baktım 3. consa giderim
        2. hemen altında this(3); cons call var bu işaret beni hangi consa götürürse içndekini alıp oraya giderim.
        tek parametre var yani elimde  3 değerimle 2. cons'a çıkarım. ordada bir this(); var
        3. boş this(); boş cons a çık demek. giderim. başlarım okumya

        */

    }
}

