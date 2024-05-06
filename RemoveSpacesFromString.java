import java.util.*;


public class RemoveSpacesFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
        }

        String output = sb.toString();
        System.out.println(str);
        System.out.println(output);


    }
}
