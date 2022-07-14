package bulutOz.inheritance01;

public class E_Officer01 extends E_Accounting01 { // memur da muhasebeyi parents seçti

    // yani bizim Accounting01 muhasebecii Employee01 i parents seçti, Officer01 de muhasebeyi parents seçti
    // baba oğul torun :)
    // yani officer hem babasının hem dedesinin datalarını kullnabilecek grandParents
    // İŞLEM YAPACAĞIMIZDAN PSVM main lazım

    public static void main(String[] args) {
        // Memur objesi oluşturalım ve . dot ile hepsine ulaşalm baba ve dedeye Account ve Employee ye
        E_Officer01 ofcr1= new E_Officer01(); // . dot ile çağıralm objemizle yani ofcr1

        //Employee01 clasından inherit edelim çalışanlar
        ofcr1.empNo=1001;
        ofcr1.name="John";
        ofcr1.surName="Silwer";
        ofcr1.address="Texas";
        ofcr1.tel="+1987 876 87";

        // Accounting01 class ından inherit edelim muhasebe
        ofcr1.hourlyFee=10;  //  saatlik ücret
        ofcr1.salary=ofcr1.salaryAccount(); // memur 1 e has maaş hesaplama metodnu da çağırdık
        ofcr1.status="Officer";
        System.out.println(ofcr1);

        // 2. Officer memeur objesi oluşturalım
        E_Officer01 ofcr2=new E_Officer01();
        //Employe01 den obje mizle çağıralım
        ofcr2.empNo=1002;
        ofcr2.name="George";
        ofcr2.surName="Diamomd";
        ofcr2.address="Sen Diago";
        ofcr2.tel="0956576866";

        //Account01 den inherit edelim
        ofcr2.hourlyFee=20;
        ofcr2.salary= ofcr2.salaryAccount();// memur 2 ye has salary account methodunu da intherice ettik
        ofcr2.status="Officer Chief";
        System.out.println(ofcr2); // to string metodumuzu çağrdgmzdan yazdrblrz maas 4800 çıktı
        // değer atamazsak null olarak gelir,
        //Artık bu factory için istediğimz kadar officer üretebiliriz

    }

    // code>>>>  generate>>>  toString()>>>> ctrl ile hepsini seç diyerek
    // kendmze to string metodu oluşturablrz
    // sout deyip obj ismimizi yazarsak tüm özellikleri görürüz
    // System.out.println(ofcr1);
    //Officer01{hourlyFee=10, status='Officer', salary=2400, empNo=1001, name='John', surName='Silwer', address='Texas', tel='+1987 876 87'}
    @Override
    public String toString() {
        // code>>>>  generate>>>  toString()>>>> ctrl ile hepsini seç diyerek
        // kendmze to string metodu oluşturablrz
        return "Officer01{" +
                "hourlyFee=" + hourlyFee +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                ", empNo=" + empNo +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

}
