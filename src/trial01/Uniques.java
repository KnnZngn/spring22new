package trial01;

public class Uniques {
    public static void main(String[] args) {


        String s = "Bismillah! are read 19 times in a day.exc";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) { //!= ise tekrar edenleri verir
                System.out.print(c + " ");
            }
         //     !=   i s m i l l a   a r e   r e a d     i m e s   i   a   d a e
         //     ==  B h ! 1 9 t n y . x c
        }
    }
}
