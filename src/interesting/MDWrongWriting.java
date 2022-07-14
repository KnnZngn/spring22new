package interesting;

public class MDWrongWriting {

    int[][] a={{0,1,2,4},{5,6}};  //1.si
       /* 2.si
        int[][] b= new int [][2] ;  // kızarır [] içine atama yapılmalı uzunluk yazılmalı length
        b[0][0]=1;
        b[0][1]=2;
        b[1][0]=3;
        b[1][1]=4;*/

    //3.sü
    //int[][][] c= {{0,1},{2,3},{4,5}}; kızarır çünkü 3 tane bricat [][][] varsa  3 tane {{ curly olmalı
    int[][][] d= new int[2][2][2]; // 4. sü uygun syntax
    //int[][] e= {1,2}; 5.si  kızarır çünkü 2 tane bricat [][][] varsa  2 tane {{ curly olmalı



}
