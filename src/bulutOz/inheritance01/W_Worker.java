package bulutOz.inheritance01;

public class W_Worker extends W_Personall {
    public static void main(String[] args) {

        //Personall objPrsn=new Personall();
        //objPrsn.surName= "Moller"; // hata vermez bldgmz obje düzeni public yazmasa bile çağırablrz
        //Worker objWrk=new Worker();
        //objWrk.name="Hans" hata verir kendi classm dan obje yapmak için önce extend yaparm

        /*   Worker objWrk=new Worker();
             objWrk.name="Hans"  kendi classm la name i çağrrsam hata verir

        1. Çünkü düz bir classta ---------public class Worker {----------
        obje, gideceğm ve kullanacağm class in ismiyle oluşur du.
        Personall objPrsn=new Personall(); yapmalıyım ki gidip çağırablym.
        Access modifier önemli bile değildi
        AMAAAAAAAAAAAAAAAAAA İNHERİTANCE EDEREK
        2.extends yazar ve başka bir classı parent seçersem
        yani onların child i sub classı olursam KENDİ OBJE Mİ YAZARIM VE HATA VERMEZ
        Not: Access modifier public veya protected olmalı private olsa yine alamam
        3. öncelikle extens keyword u ile parent seçelim
        ------public class Worker extends Personall{
        4. işte şimdi gerçekten işçi ürettim,
        diğerinde aslında personel üretmiş oluyorum,
        inheritance burda devreye girer.
         */
        W_Worker objWrk=new W_Worker();
        objWrk.surName="Wooder";
        objWrk.name="Thomass";
        objWrk.address="Holland";
        System.out.println(objWrk.name); //"Thomass"
    }
}
