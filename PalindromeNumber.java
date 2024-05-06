import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int og = n;

        int rem;
        int reverse = 0;

        while(n>0){
            rem = n%10;
            reverse = reverse*10 + rem;
            n=n/10;
        }

        System.out.println(reverse);

        if(og == reverse){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("not a palindrome number");
        }
    }
}
