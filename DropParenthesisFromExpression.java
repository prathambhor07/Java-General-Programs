import java.util.*;
public class DropParenthesisFromExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Result after removing parentheses: " + solve(inputStr));
    }

    static String solve (String str){
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(' || arr[i] == ')'){
                continue;
            }
            sb.append(arr[i]);
        }
        return new String(sb);
    }
}
