import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem;
        int reverse = 0;

        while(n>0){
            rem = n%10;
            reverse = reverse*10 +rem;
            n=n/10;
        }

        System.out.println(reverse);
    }
}
