//Problem:
//find maximum number in a subarray of a given length m
//ex: arr = 2,4,7,1,6,3
//m = 3;
//output = 7 7 7 6

public class MaxInSubarrayOfM {
    public static void main(String[] args) {
        int[] arr =  {2,4,7,1,6,3};
        int k = 3;
        int n = arr.length;

        for(int i = 0; i<n - (k-1); i++){
            int max = 0;
            for(int j = i; j<i+k; j++){
                //to print values
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }
}
