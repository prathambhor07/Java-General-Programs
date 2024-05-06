import java.util.*;


public class HashMapTutorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {23,73,-6, -1, 24,24,24,24,-1,-1,76,-1};

        int ans = 0;
        int maxfreq = 0;

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                val += 1;
                map.put(arr[i], val);
            }
            else{
                map.put(arr[i], 1);
            }
            if(map.get(arr[i])>=maxfreq){
                ans = arr[i];
            }
        }
        System.out.println(ans);

        System.out.println(map);
    }
}
