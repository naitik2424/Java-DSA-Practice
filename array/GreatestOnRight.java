package array;
import java.util.*;
public class GreatestOnRight {
    public static void main(String[] args){
        int[] arr = {17,18,5,4,6,1};
        int n =arr.length;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            int curr = arr[i];
            arr[i] =max;
            max = Math.max(max,curr);
        }
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr));
        }
    }
    
}
