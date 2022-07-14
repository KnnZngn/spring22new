package lambda_functional_programming;
    /*
    1)Lambda is Functional Programming, we started to use Lambda in Java 8
    2)In Functional Programming we focus on 'What to do? ne yapalım' but in Structured Programming we focus on 'How to do? nasıl yapalım
    3)Functional Programming can be used just with Arrays and Collections.
    4)By using 'entrySet()' method, you can convert Map to Set, then you can use Functional Programming in Maps as well.
     */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        System.out.println(l);
        printElementsStructured(l);
        System.out.println();
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxElement01(l);
        getMinGreaterThanSevenAndEven01(l);
        getMinGreaterThanSevenAndEven02(l);
        getMinGreaterThanSevenAndEven03(l);
        halfOfElementsDistinctInReverse(l);
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));  //lambda nın syntax ı for each .dot iel stream dan sonra çıkıyor, stream()structur ı functional yapıyor
        //  .stream() list i []brecat tan çıkardı farklı formata soktu
        // t-> lambda nın expression u forEach(içine yazarız t-> sout(t))

    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)
    public static void printEvenElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)
    public static void printEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " ")); //81 17161 81
        //1. stream() method ile list in formatını değiştirdi, bunlara METHOD denmiyor FUNCTİONALITY deniyor
        //2.filter() methodunu if yerine kullandı
        //3. forEach() metoduyla da yazdırdı t-> ile
        //t->   t->   t->   this is lambda expresssion
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //map(t-> t*t) karesini almak için map() metodu içinde t ile t yi çarptı
        // bu map map değil artık bu lambda nın metodu, abstract method
        // filter ile if yapıp tek sayıları bulduk, map metoduyla karelerini yazdık
    }

    //4)Create a method to print the cube of distinct(unique) odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    public static void printCubeOfDistinctOddElements(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " ")); //729
        //distinct() function sayıları bulur ve uniq yapar yani 3 tane 8 varsa teke indirr
        // 8,9 , 131,10,2  kalır geriye
        // ilk önce stream() ardından if yerine filter() 9 131 9 kalır
        // sonra map() function da işlem yaptı 9*9*9=729 131*131*131=2248091
    }
    //5)Create a method to calculate the sum of the squares of distinct even elements
    // çift sayıların karesinin toplamını istiyor.  reduce() function u kullanacağız azaltmak demek,
    //8,2,10  yani 8*8 2*2 10*10 un toplamı 168 yapar yani sum=sum+i gibi

    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum); // 168
        //reduce() function(fankşinaliti iz)
        //reduce() 2 paameter ile çalışır sum=0 olduğundan 1. si 0
        // diğeri t ile u nun toplamı çarpım deseydi t*u olurdu burda t+u
        // syntax ı t,u->   sonra yapacağmz işlem
    }

    //6)Create a method to calculate the product=çarpım of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);// sum=sum*1 gibi //4096000
        //list.stream.distinct.filter(t>1).map(t>1).reduce(t>1);  reduce(1,(t,u)->t*u); bu seferde çarpma yaptık
    }

    //7)Create a method to find the maximum value from the list elements
    //1st Way:
    public static void getMaxElement01(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max); //131
        // distinct tekrar lı sayıları teke indirir unıque yapar  8,9,131,10,2  kalır geriye
        //reduce nin 2 parametresi olması lazım başlangıç en küçükm olacağından Integer.MIN başlangıcımız
        // yani -negatig 2 billion...
        // sonra bildgmz ternary kullandık t>u ? t : u
    }

    //2nd Way:
    public static void getMaxElement02(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(max);
        //sorted()  küçükten büyüğe sıraladı ascending order

    }

    //Homework
    //8)Create a method to find the minimum value from the list elements(In 2 ways)
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    //1st Way:
    public static void getMinGreaterThanSevenAndEven01(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min);
        //max ı başlangıç aldık bu sefer reduce()functionality
    }

    //2nd Way:
    public static void getMinGreaterThanSevenAndEven02(List<Integer> list) {
        Integer min = list.
                stream().
                distinct().filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()). // comperator.reverseOrder methoddur tersine çvrr
                        reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(min);
    }

    //3rd Way:  en kolayı
    public static void getMinGreaterThanSevenAndEven03(List<Integer> list) {
        Integer min = list.
                stream().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted().
                findFirst().
                get();
        System.out.println(min);
    }

    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    public static void halfOfElementsDistinctInReverse(List<Integer> list) {
        List<Double> result = list.   // double olması önemli çünkü 2 ye bölecek
                stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0). // map içinde matematik işlemleri yapıyoruz
                        sorted(Comparator.reverseOrder()).
                collect(Collectors.toList()); // [] liste dönüştürür [65.5, 5.0, 4.5, 4.0]
        System.out.println(result);
    }
}

