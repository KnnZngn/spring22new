package bulutOz.inheritance01;  //PERSON > WORKER > FOREMAN

public class DT_Inh_Person {
    public String status="Personnel,Staff"; // herkes variable a ulaşsın diye public yaptık
    public String rights="All staff have equal rights";
    public String dayOff="All personnel(staff) can take day off(izin) for 4 week in a year";// yasin objesinden ulaşblrm



    public void overtime() {  // herkes variable a ulaşsın diye public yaptık
        System.out.println("All personnel(staff) works for 5 days in a week and for 8 hours in a day");
    }

    public void calculateSalary(){
        System.out.println("All personnel(staff) gets  for 30 days * 8 hours * 10 €= " + (30*8*10)+" € salary");
    }


}
/*
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

   örnek Arraylist
   List<String> list= new ArrayList<>();

   ----------------SORUUUUUUUUUUUUUU----------------2 doruk arasında ne fark var peki ikisi de aynı şeyleri yazdı.
         ----------CEVAP :    OVER RİDİNG TE

            1. DT_Inh_Person   doruk            =             new          DT_Inh_Foreman();  Personel boyalı ustabaşı objesidir(doruk) çünkü const u ustabaşı
            2. DT_Inh_Person   doruk            =             new          DT_Inh_Person();   Direk personel objesidir(doruk)
            3. DT_Inh_Worker   ahmet            =             new          DT_Inh_Foreman(); işçi boyalı ustabaşı objesidir(doruk) çünkü const u ustabaşı
            4. DT_Inh_Worker   ahmet            =             new          DT_Inh_Worker();  Direk işçi objesidir(doruk)
      syntx:5.  data type   ,  variable    ,assigment         new          value/yani constructor();
         */

