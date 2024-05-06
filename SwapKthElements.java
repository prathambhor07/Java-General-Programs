import java.util.Scanner;

public class SwapKthElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();


        int a = arr[k-1];
        int b = arr[arr.length-k];

        int temp = a;
        a=b;
        b=temp;

        arr[k-1] = a;
        arr[arr.length-k] = b;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
