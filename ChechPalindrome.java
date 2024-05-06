import java.util.Scanner;

public class ChechPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        str = str.toLowerCase();

        String rstr = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            rstr = ch+rstr;
        }

        System.out.println(rstr);

        if(str.equals(rstr)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }


    }
}
