package trial01;

public class String_Methods {
    public static void main(String[] args) {
        String n="Bismillah-ir-Rahmanir Rahim 19 ";

        System.out.println(n.toUpperCase()+" 1.");  // BISMILLAH-IR-RAHMANIR RAHIM
        System.out.println(n.toLowerCase()+" 2.");
        System.out.println(n.trim()+" 3.");   // boşluğu kırptı
        System.out.println(n.split("")+" 4.");
        System.out.println(n.split("-")+" 5.");System.out.println(n.split(" ")+" 6.");
        System.out.println(n.split("i")+" 7.");
        System.out.println(n.charAt(0)+" 8.");  // charAt(0)  B yi verir en baştaki
        //System.out.println(n.charAt(n.length())+" 9."); hata verir
        System.out.println(n.charAt(n.length()-1)+" 10.");  /// son index teki harfi verir o da boşluk
        System.out.println(n.trim()+" 11.");  // sondaki boşluğu kırptı
        System.out.println(n.charAt(2)+" 12.");  // charAt(2)  s yi verir
        System.out.println(n.substring(7)+" 13.");
        System.out.println(n.substring(7,7)+" 14.");  // boşluk yazdırır
        System.out.println(n.substring(0,1)+" 15.");
        System.out.println(n.substring(0,n.length())+" 16.");  // 0 dan başladı length e kadar hepsini alır
        System.out.println(n.substring(3,7)+" 17.");   // mill 3 ten başlayacak 7 dahil ve sonrası hariç
        System.out.println(n.indexOf("s")+" 18.");  // 2    s harfi nin indexini verir. 2
        System.out.println(n.indexOf("a",9)+" 18-1.");  // 14 ilk 9 u atla ondan sonraki a yı bul demek
        System.out.println(n.indexOf("man")+" 19.");  // 16 man in ilk harfi m olduğu için m nin index numarasını verir 16
        System.out.println(n.replace("Rahim","Rauf")+" 20."); //Rahim yerine rauf yazdı  Bismillah-ir-Rahmanir Rauf
        System.out.println(n.toString()+" 21.");  // ne işe yarar
        System.out.println(n.startsWith("Bis")+" 22.");  // true döndürdü Bis ile başlıyor mu diye soruyor bu method
        System.out.println(n.endsWith("19 ")+" 23.");  // true döndürdü "19 " ile mi bitiyor diye sorar bu method
        System.out.println(n.strip( )+ " 24. "); // ==? ne işe yarar

    }
}
