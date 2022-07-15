package lambda_functional_programming;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printInUpperCase01(l);
        System.out.println();
        //   printInUpperCase02(l);
        printElementsSortedByLength(l);
        System.out.println();
        printElementsReversedSortedByLength(l);
        System.out.println();
        printDistinctSortedByLastChar(l);
        System.out.println();
        printSortedByLengthThenSortedByInitial(l);
        System.out.println();
        //removeIfTheLengthIsGreaterThanFive(l);
        //printRemoveIfStartingWithAEndingWithN(l);
        printRemoveIfStartingWithAEndingWithN02(l);



    }

    //1) Create a method to print all list elements in uppercase
    //1st Way:
    public static void printInUpperCase01(List<String> list){

        list.stream().map(String::toUpperCase).forEach(UtilsNt::printTheSameLineWithSpace);

    }
    //2nd Way:
   /* public static void printInUpperCase02(List<String > list){

        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }*/

    //2) Create a method to print the elements after ordering according to their lengths
    public static void printElementsSortedByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementsReversedSortedByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsNt::printTheSameLineWithSpace);

    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctSortedByLastChar(List<String > list){
        list.stream().distinct().sorted(Comparator.comparing(UtilsNt::getLastChar)).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    //5) Create a method to sort the elements according to their lengths then according to their first character

    public static void printSortedByLengthThenSortedByInitial(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsNt::printTheSameLineWithSpace);

    }
    //6) Remove the elements if the length of the element is greater than 5

  /*  public static void removeIfTheLengthIsGreaterThanFive(List<String> list){

        list.removeIf(t->t.length()>5);

        System.out.println(list);

    }*/

    //7) Remove the elements if the element is starting with â€˜Aâ€™, â€˜aâ€™ or ending with â€˜Nâ€™, â€˜nâ€™
    //1st Way:
    /*public static void printRemoveIfStartingWithAEndingWithN(List<String> list){

        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a' || t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');

        System.out.println(list);

    }*/
    //2nd Way:
    public static void printRemoveIfStartingWithAEndingWithN02(List<String> list){

        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
        System.out.println(list);
    }
}
