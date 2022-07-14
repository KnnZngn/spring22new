package bulutOz.encapsulation_01;

//Get hep getirir, değer atayamaz Set hep update yapar değer atar,
public class Encapsulation_DataHiding {
    // OOP nin restrict sınırlandırma araçlarından biridir. access modifier da oldgu gbi
    //önemli class üyelerini koruma altına alır, özellikle değşmesni istemedgmz VERiABLE ve METHODS ları
    // bilgiye erişim ve değişim i ayarlamak için kullanılır,
    // istedgmz kişiye açarız istedgmze açmayız
    public static void main(String[] args) {
        Empty_Encapsulation obj1=new Empty_Encapsulation();
        //obj1.num=7;
        //Note 1. obj ile başka classtaki private olanlara ulaşamayız kızarır
        //burda devreye encapsulation girer
        //Code yazan bölüme gelip generate:üret i seçeriz. çıkan kutudan Getter and Setter i seçeriz
        //Code>Generate>Getter and Setter> hepsini seç(CTRL ile yapablrz) ve okey.  sağa tıklayınca da generaTE çıkar
        //Get hep getirir, değer atayamaz Set hep update yapar değer atar,
        // getter ile setter birleşirse veriable mız ve methodumuz public gbi olur, hem yazdırıp okutur hem değiştirir
// sadece setter değer girer okuyamaz sonucu göremez,  getter okur değri raporu  görür ama değiştiremez
//ex: hastane program ile tc mi göreblr get yapar ama set yapıp değiştiremez
        //GETTER: okunsun ama yazılamasın istersek getter durur setteri kaldırırz.böyle olunca clastaki veraible ulaşablrm ama yeni atama yapamam
         obj1.getNum();  // obj ile çağrablrm artk num veriable i get ile beraber gelir getNum olur
        // System.out.println(obj1.getNum()); //0 getirdi default değer
        //int num1= obj1.getNum(); atamayı burda yapablrm
        //SETTER: değiştirilebilsin ama okunamasın dersek setter
        obj1.setNum(9876);  // set ile değiştireblrm atama olmadan ve yazdıralm
        System.out.println(obj1.getNum());  // set ile değştrdm get ile getrdm yeni değer 9876 oldu.
        //System.out.println(obj1.num);  çağırmaz kızarır
        /*
        ÖZET  Bir varaible ı encapsule edebilmek için (yetkileri sınırlama) ve (variable ı koruma)
        0. proje yaparken variable ve method ları bi class ta oluştrp diğer package ve class lardan çağırma yolunu kullanacağz
        1. Access modifier i private yapmalıyız
        2. Code>Generate>Getter and Setter> ctrl ile tüm variabl ları seçeriz
        3. çağırmak, görebilmek, okumak içn GETTER i kullanırız.
        4. değiştirmek, yazmak,yenilemek için SETTER i kullanırız
        5. Hem setter hem getter yaparsak bizim variable ımız public gibi olur.
         .public yapmak yerine developer lar getter ve setter i kullanır
         */
    }
}
