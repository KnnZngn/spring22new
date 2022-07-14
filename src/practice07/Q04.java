package practice07;

import java.util.Arrays;

public class Q04 {
    // Convert the "Congratulations" word to "sn**t*l*t*rgn*C" by using Array methods.
    public static void main(String[] args) {
        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        String strNew="";

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].equalsIgnoreCase("a") || arr[i].equalsIgnoreCase("e")||arr[i].equalsIgnoreCase("i")||arr[i].equalsIgnoreCase("o")||arr[i].equalsIgnoreCase("u")){
                arr[i]="*";
            }
            strNew=strNew+arr[i];

        }
        System.out.println(strNew);

    }
}
