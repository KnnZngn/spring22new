package interesting;

public class MDArraysForEach {

    public static void main(String[] args) {
        //int mdArr[][][]= new int[2][2][2];
        int md1[][][] = {{{1, 2, 3}, {4, 5, 6}, {7}}, {{10}, {11, 12}, {3, 14, 15}}, {{23, 24, 25,}, {67, 68, 69}, {0, 81, -7}}}; //[][][]
        //System.out.println(Arrays.deepToString(mdArr)); // [[[0, 0], [0, 0]], [[0, 0], [0, 0]]]
        System.out.println(md1.length);
        System.out.println(md1[0][0].length);
        System.out.println(md1[0].length);


        for (int i[][] : md1) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(k + " ");  // 1 2 3 4 5 6 7 10 11 12 3 14 15 23 24 25 67 68 69 0 81 -7
                }
            }
        }

    }
}