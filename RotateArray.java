import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt() ;

        k = k % arr.length;
        if(k < 0){
            k=k+arr.length;
        }

        for(int i = 1; i<=k; i++){
            rotate(arr);
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr){
        int temp = arr[0];

        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}

