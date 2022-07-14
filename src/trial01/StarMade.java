package trial01;

public class StarMade {
    public static void main(String[] args) {
        int col = 1;
        int row = 7;
        String s = "";

        for (int i = 1; i <= row; i++) {
            //String s = "";
            for (int j = 1; j <= col; j++) {

                s = s + "* ";


            }
            System.out.println(s);
        }


    }
}
/*
for (int i = 0; i < 5; i++) {
for (int j = 0; j <= i; j++) {
System.out.print("*");
}
System.out.println("");
}
 */