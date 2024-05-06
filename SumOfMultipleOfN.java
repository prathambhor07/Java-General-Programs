import java.util.Scanner;

public class SumOfMultipleOfN {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int ans = calcSum(n);

        System.out.println(ans);
    }

    public static int calcSum(int n){
        int sum = 0;
        for(int i = 1; i<=10; i++){
            int temp = n*i;
            sum = sum + temp;

            temp = 0;
        }

        return sum;
    }

}
