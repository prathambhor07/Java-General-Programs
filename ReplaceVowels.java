//replace vowels by z
import java.util.*;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

//        StringBuilder sb = new StringBuilder(str);
//
//        int count = 0;
//
//        for(int i=0; i<sb.length(); i++){
//            char ch = sb.charAt(i);
//
//            if(ch == 'a' || ch=='e' || ch=='i' || ch == 'o'|| ch=='u'){
//                count++;
//            }
//        }
//
//        System.out.println(count);

        char[] arr = str.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] =='a' || arr[i]=='e' || arr[i]=='i' || arr[i] == 'o'|| arr[i]=='u'){
                arr[i] = 'z';
            }
        }

        String ans = Arrays.toString(arr);

        System.out.println(arr);
    }
}
