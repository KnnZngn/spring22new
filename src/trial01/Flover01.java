package trial01;
/*
        Soru :Güzel,genç bir hanım dostlarına Afrika’dan getirdiği
        çiçekleri tanıtıyordu:”Şu kırmızı çiçekler her 4 günde bir
        ,şu maviler her 7 günde bir ,şu sarılarsa her 13 günde bir
        açar.Çiçekler açtıkları günün akşamı da solar.
        ”Ve sonra şöyle dedi:”Gördüğünüz gibi şimdi kırmızı,mavi
         ve sarı çiçekler hep birlikte açmış durumda.

       Bu çiçeklerin ne zaman tekrar hep birlikte açacağını
        hesap edin o gün gelin,günü doğru hesap edip gelen bir
        beyle evlenirim.Siz olsanız kaç gün sonra giderdiniz ?
         */

public class Flover01 {
        public static void main(String[] args) {
            boolean maviLive = false;
            boolean sariLive = false;
            boolean kirmiziLive = false;
            for (int i = 1; i < 1000; i++) {
                if (i % 4 == 0) {
                    kirmiziLive = true;
                } else {
                    kirmiziLive = false;
                }
                if (i % 7 == 0) {
                    maviLive = true;
                } else {
                    maviLive = false;
                }
                if (i % 13 == 0) {
                    sariLive = true;
                } else {
                    sariLive = false;
                }
                if (sariLive && maviLive && kirmiziLive) {
                    System.out.println(i + ".Gunde Gel");
                    break;
                }
            }
        }
    }

/*
Soru basit bir obeb sorusu aslında sayıların obebini alarak direkt
 bulabilirdik(7*13*4=364) ama ben mod almaya göre yapmak istedim
 değişiklik olsun diye..Günleri tek tek sayıp çiçekler yaşayınca
 true,öldüğü zaman da false atadım.3 çiceğin aynı zamanda
true olduğu zamanda bizim istediğimiz gün oluyor.Kodlarımız şöyle:
 */