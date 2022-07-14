package bulutOz.inheritance01;//  özellikle 44. dk ya bak

public class DT_Inh_Foreman extends DT_Inh_Worker{
    public String status="Foreman";
    public String rights="Foreman take one extra day off per week";






    public void overtime() {
        System.out.println("If There is any breakdown(fault,defect), foreman works without taking wage(fee)");
    }

    public void calculateSalary(){
        System.out.println("Foreman gets  for 30 days * 8 hours * 12 €= " + (30*8*12)+" € salary");
    }



    public static void main(String[] args) {
        DT_Inh_Foreman yasin=new DT_Inh_Foreman();
        System.out.println(yasin.status); //foreman JAVA önce içinde bulundgmz classa bakar ve varsa onu getirir yoksa parent lara gider
        System.out.println(yasin.rights); // Foreman take one extra day off per week
        System.out.println(yasin.bonus); //All workers gets a bonus(ikramiye)  for in a year
        //JAVA önce içinde bulundgmz classa bakar ve varsa onu getirir yoksa parent lara gider
        System.out.println(yasin.dayOff); // burda olmadığı halde personnel clasından aldı getirdi
        yasin.calculateSalary();

        //44. DK obje de data trünü parent yaparak ulaşmak, MUHATAP işçi classı artık
        // DT_Inh_Worker ahmet=new DT_Inh_Foreman();----- obje kurarken  başını class adını işçi yaparsak direk işçinin özelliklerini alır
        //yani ahmeti işçi boyasına boyadık, bu class ta status bulduğu halde işçi den alacak çnkü işçi boyasıyla boyandı
        DT_Inh_Worker ahmet=new DT_Inh_Foreman();   //yani ahmeti işçi boyasına boyadık
        System.out.println(ahmet.status); //foreman yazmayacak workers yazacak
        System.out.println(ahmet.rights); // izin dayoff,yazmayacak kıdem tazminatı(serverance pay)yazacak workers taki gbi
        System.out.println(ahmet.bonus);
        System.out.println(ahmet.dayOff);
        ahmet.calculateSalary();

        DT_Inh_Person doruk=new DT_Inh_Foreman();
        System.out.println(doruk.status); // foreman yazmayacak, cünkü dorukun boyası personnel,   Personnel,Staff
        System.out.println(doruk.rights);
        //System.out.println(doruk.bonus);// kızarır CTE verir çünkü parent child dan bişey alamaz. doruk person class tan yani parent grand-parent
        System.out.println(doruk.dayOff);
        doruk.calculateSalary();
         /*  ----------------SORUUUUUUUUUUUUUU----------------2 doruk arasında ne fark var peki ikisi de aynı şeyleri yazdı.
         ----------CEVAP :    OVER RİDİNG TE

            1. DT_Inh_Person   doruk            =             new          DT_Inh_Foreman();  Personel boyalı ustabaşı objesidir(doruk) çünkü const u ustabaşı
            2. DT_Inh_Person   doruk            =             new          DT_Inh_Person();   Direk personel objesidir(doruk)
            3. DT_Inh_Worker   ahmet            =             new          DT_Inh_Foreman(); işçi boyalı ustabaşı objesidir(doruk) çünkü const u ustabaşı
            4. DT_Inh_Worker   ahmet            =             new          DT_Inh_Worker();  Direk işçi objesidir(doruk)
      syntx:5.  data type   ,  variable    ,assigment         new          value/yani constructor();
         yasin de ahmet te doruk ta usta başı
        1. obje nin başına hqangi classı yazarsak obje o class gibi davranır,
                bu sadece variable lar için geçerlidir.
        örnek ahmet.bonus // "All workers gets a bonus(ikramiye)  for in a year"
                yazdırırken

        2. obje nin başına yazdgmz class method kullanımında etki etmez
        new den sonra hangi class varsa o class ın metodunu kullanır
                yani kendi sınıfının metodunu kullanır.
        örnek  ahmet.calculateSalary(); 2880 başına işçi yazmamıza
        rağmen ustabaşı foreman hesaplandı 2880 €

        3. peki kendi class ında method bulamazsa ne olur
                hepsi için bir üst class a gider önce orda bulursa hemen onu kullanır
                yani personel olan doruk personel e gitmez. o da işçi ye worker class ına gider
                ve o methodu kullanır, şayet orda bulamazlarsa o zaman
                personel maaaşı hesaplanır

        4. SONUÇ 1.variable lar ı kullanmak için babayla boyanmışsa
        babaya gider, kendi class ında aynı variable olsa bile baba dan alır
                örnek doruk.status() kendi class ı foreman da olmasına
                rağmen boyasını süründüğü babadaki statu yü alır ve personell staff yazdırır

                SONUÇ 2. Methodlar için child classı yani kendi class ında varsa
                direk onu kullanır, bulursa hemen çalıştırır
                şayet bulamazsa babaya gider

          */


    }
}
