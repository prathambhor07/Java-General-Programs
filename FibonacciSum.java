import java.util.Scanner;

public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();

        int ans = fiboSum(n);

        System.out.println(ans);
    }
    public static int fiboSum(int n){

        int a = 0;
        int b = 1;
        int c = 0;

        int sum = a+b;

        for(int i = 1; i<n; i++){
            c = a+b;
            sum = sum + c;
            a=b;
            b=c;
            c=0;
        }
        return sum;
    }
}
