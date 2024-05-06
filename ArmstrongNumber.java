import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int og = n;

        int sum = 0;
        int reverse = 0;
        int rem;

        while(n>0){
            rem = n%10;
            reverse = reverse * 10 + rem;
            sum += rem * rem * rem;
            n=n/10;
        }

        System.out.println(sum);

        if(og == sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
