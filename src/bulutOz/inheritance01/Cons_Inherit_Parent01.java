package bulutOz.inheritance01; // 36. video 1.27. dk

public class Cons_Inherit_Parent01 {
   protected Cons_Inherit_Parent01(){ //default constructor u ortaya çıkardık
        System.out.println("Baba,Parent without paremeter cons executed");

    }

    public Cons_Inherit_Parent01(int sayı3, int sayı4) {
        System.out.println("baba(2'li) parent with 2 parameter executed");
    }
}
