package bulutOz;

//VAR ARGS  (...) tree dots means ---var Args---
// array gibi davranır
// for each loop u kullanır  for(int w : a) {sum=sum+a;             }
//  1 public static int add(int...a) olur  2 public static int add(int...a, int b) olmaz  3 public static int add(int b, int...a) olur
//  2 public static String lngthWord(String...str) olur  2.public static String lngthWord(String...str, String str2) olmaz
public class Var_Args01
{
    public static void main(String[] args) {   // 1 milyon değer value bile koyabiliriz, ama sonrasına 2. data yı parametre olarak ,ekleyemeyz gerek yok
        System.out.println(add());  // 0 arrays gibi boş hali bile hesaplar 0 verir
        System.out.println(add(2,3)); // 5 istediğmz kadar deger girebilrz a+b+ diye tanmlamamza grk yok işmizi kolaylaştryr
        System.out.println(add(5,7,9,2,9,8,7,76,5,13)); //141

        lngthWord("Ahmet","Ali","Kamuran","George","Tom","Christian");  // en uzun kelime Christian

    }

    public static int add(int...a){  //istediğimiz kadar rakam yazablrz, endless pit gibi, unlimited value koyablrz,
        // int b yi arkasına koyamayız ama önüne koyabilirz. arkasındayken unreachable kod olur ulaşamaz, ama genelde tek int...a kullanlr
        // public static String word(String...s){}

        int sum=0;
        for(int w : a){      //varArgs array gibi davranır for each loop kullanır
            sum=sum+w;

        }
        return sum;  // return den sonra kod yazılmaz hata verir unreachable kod olur
    }
    public static String lngthWord(String...str){
        String theLongestWord="";
        for (String w:str ){
            if (w.length()>theLongestWord.length()) {  //w lerin lengthi "" hiçlikten byk olduğu müddetçe dvm et ve
                theLongestWord=w;  // yeni en byk kelime olan w yi "" hiçlik yerine ata
            }


        }
        System.out.println(theLongestWord);
        return theLongestWord;
    }

}