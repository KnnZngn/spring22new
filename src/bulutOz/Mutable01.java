package bulutOz;
  /*
  1.Mutable= changeable, flexible, variable    ex= List is mutable
  2.Im-Mutable= unChangeable, stable, fixed, constant  ex= string is im-mutable
  Neden ihtiyaç duyulmuş. çoklu çalışma için, yani= MULTI THREAD SAFE= güvenli eş zamanlı
  çalışma
  1.Mutable classes= StringBuilder, StringBuffer,Arrays,ArrayList
  2.Immutable classes= String, Tüm Wrapper lar(Integer,Character,Long vs)
  Eğer atama yapıp stringi değiştrrsek Java onu klonlar. referans aynı kalır. eski değer garbage olur.

  Stringte equal() metodu ile == (eşit eşit) aynı sonucu vermeyebilir.çünkü .equal() method
  sadece Eren e bakar işlem yoluna ve yapılış işlemine bakmaz
  == eşit eşit referansa da bakar ve ayrı yollarla oluştrulmuşşa(yani referans) yazı aynı
  olsa  bile false sonucnu vereblr, mükemmeliyetçidir
  STRİNG İMMUTABLE olduğundan...  == eşit eşit mükemmeliyetçidir yola da bakar
  */

public class Mutable01 {
    public static void main(String[] args) {
        String str1 = "Eren";  // 1 ve 2 de value aynı, referansta aynı çnkü aynı yolla aynı işlem yaplrk yazldı
        String str2 = "Eren";  // 1 ve 2 de value aynı, referansta aynı çnkü aynı yolla aynı işlem yaplrk yazldı
        String str3 = new String("Eren"); // value aynı Eren ama referans farklı çnkü farklı işlem yaplrk eren yazldı
        String str4 = str1+ "";  // value yukardakiyle aynı ama refere farklı çnkü işlm yaplrk Eren yazldı

        System.out.println(str1.equals(str2));  //true, equals() sadece yazıya bakar ve true der
        System.out.println(str1.equals(str3));  //true
        System.out.println(str1.equals(str4));  //true
                                                // == mükemmeliyetçidir.
        System.out.println(str1 == str2); //true   //
        System.out.println(str1 == str3); //false  // == hem yazıya hem yapılma yoluna bakar
        System.out.println(str1 == str4); //false  // == mükemmeliyetçidir işlem yoluna da puan verir :)

    }
}
