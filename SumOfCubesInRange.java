import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfCubesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int m = sc.nextInt();
        System.out.println("Enter second number");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = m; i <=n; i++){
            sum+= i*i*i;
        }

        System.out.println(sum);
    }
}
