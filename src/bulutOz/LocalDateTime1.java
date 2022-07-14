package bulutOz;

import java.time.*;
import java.time.format.DateTimeFormatter;  // import etmeliyiz
import java.util.Scanner;
                                  //  .dot ile bir sürü formüle ulaşablrz ex get, is , plus, minus, sone
public class LocalDateTime1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();  //1 tarih date verir  01.07.2022
        LocalTime time1 = LocalTime.now();  //2 saat verir
        LocalDateTime lclTime2 = LocalDateTime.now();  // 3 tarih te saat te verir .get(year)
        LocalDate wholeD = LocalDate.of(2016, 8,5);  // 4 istedgmz tarhi grmek için

        //EXAMPLES -------- FOR INSTANCE   .dot ile bir sürü formüle ulaşablrz ex get... is..
                     //LOCAL DATE
        System.out.println(wholeD);  // 2016-08-05
        System.out.println(wholeD.getDayOfYear()); // 218> 5 ağustos 2016 yılın 218. günüymüş.
                     // LOCAL TİME
        System.out.println(date1.getDayOfYear());  // 182  . gündeyiz
        System.out.println(time1);  // 22:03:04.838262600   now saati verir
                     //LOCAL DATE TİME
        System.out.println(lclTime2);  // 2022-07-01T22:14:52.741903200  tamamıyle verdi 2022.7.1/ 22:14:52.7777 salise
        System.out.println(lclTime2.getNano());  // 871207200 saliseyi verdi

        // ZONE ID
        LocalDate zoneD = LocalDate.now(ZoneId.of("Japan"));  // now ın içine zoneId.of("Bölge") yazarz
        System.out.println(zoneD);  // 2022-07-02   japonya da 2 temmuz olmuş bile :)
        LocalDate date5 = LocalDate.now();

              //  FORMAT  ex gün ay yıl saati istedgmz formata çevirmek için 2 işlem yaparız
        //  1. si  DateTimeFormatter.ofPattern(""); objesi oluştururuz.
        //  içine istedgmz formatı String gibi yazarız bu pizim patterenimiz yani şeklimiz(""D/MM/YYYY); gibi
        //  2. si sout içinde objemze dot koyar .format(); formulünün içine değiştrmk istedgmz variable ı yazarız
        //  (formatter1.format(lclTime2))  gibi
        // d:7  M:9  YY:22 &  dd:07 MM: 09  YYYY: 2022 & EEE:Sun MMM:Aug MMMM:August
        // HH:02 H:2    HH:21   h:9    m: minute  s: second   a:am pm
        DateTimeFormatter formatter1= DateTimeFormatter.ofPattern("d/M/YY"); // 01/7/22  lcl time 2 yi benm istedgm gbi verdi
        System.out.println(formatter1.format(lclTime2)); // 01/7/22  lcl time 2 yi benm istedgm gbi verdi
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd/MMMM/YYYY"); // 01/Temmuz/2022   dil türkçeymiş
        System.out.println(formatter2.format(lclTime2));
        DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("HH : m : s"); //23 : 15 : 27
        System.out.println(formatter3.format(lclTime2));

        // 2 TARİH ARASINDAKİ ZAMANI BULMA  Period.between(d1,d2)ayrıntları verir. birde get ile sadece istedgmzi alablrz

        LocalDate d1= LocalDate.now();
        LocalDate bd1=LocalDate.of(1985,02,16);
        // yaş bulmak için ayrıntılı
        Period age1= Period.between(bd1,d1);
        System.out.println(age1);  //P37Y4M15D   Period 37 Year 4 Mounth  15 Day

        // sadece yıl bulmak için int e yeni atam yapar getYears deriz.
        int ageYear1= Period.between(bd1,d1).getYears();
        System.out.println(ageYear1);  // 37 buldu   P37Y4M15D buradan get year yaptık

         // fixme   sout içine fixme yazınca direk tarih veriyor. gün ay yıl
        //System.out.println(// FIXME: 2.07.2022 );



        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user give me born date");
        int bornDate = scan.nextInt();
        calcDob(bornDate);  // kendi methodum :)
    }

    private static int calcDob(int bornDate) {
        int age = LocalDateTime.now().getYear() - bornDate;
        System.out.println(age);
        return age;
    }

}
