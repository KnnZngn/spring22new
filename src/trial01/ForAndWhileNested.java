package trial01;

public class ForAndWhileNested {
    public static void main(String[] args) {
        String table[] = {"aa", "bb", "cc"};
        for (String w : table) {
            int ii = 0;
            while(ii< table.length){
                System.out.println(w+", "+ii);
                ii++;

            }
        }

    }

}
