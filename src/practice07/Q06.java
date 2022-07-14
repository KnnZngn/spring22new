package practice07;

public class Q06 {
    //Type a method to check if an int Array is symmetrical or not.
    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 2, 1};

        System.out.println("Is Array symmetrical? "+symmetrical(arr));
    }
    public static boolean symmetrical(int[] arr){
        boolean result=false;
        for(int i =0; i< arr.length;i++){
            if(arr[i] == arr[arr.length-1-i]){
                result=true;
            }else{
                result=false;
                break;

            }

        }
        return result;
    }

}
