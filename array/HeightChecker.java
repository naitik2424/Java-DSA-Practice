package array;
import java.util.Arrays;
public class HeightChecker {
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        int n = heights.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i] =heights[i];
        }
        int cnt=0;
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            if(temp[i] != heights[i]){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    
}
