import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for(int i =1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }

        System.out.println(count);

        if(count == 2){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }



    }
}
