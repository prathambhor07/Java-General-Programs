import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }

        int[] arr = {1,2,3,4,5};

        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                //to print values
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
