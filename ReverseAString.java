import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();

        String rstr = "";


        for(int i = 0; i<str.length(); i++){
            char ch=str.charAt(i);
            rstr = ch + rstr;
        }

        System.out.println(rstr);
    }
}
