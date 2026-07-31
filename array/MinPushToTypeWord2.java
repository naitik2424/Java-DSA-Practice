
package array;
import java.util.*;
public class MinPushToTypeWord2{
    public static int minPushToTypeWord(String word){
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;

        }
        Arrays.sort(freq);
        int ans=0;
        int push=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0) continue;
            ans+=freq[i]*(push/8+1);
            push++;
        }
        return ans;

    }
    public static void main(String[] args){
        String word = "hellonaitik";
        System.out.print("Min Push : ");
        System.out.print(minPushToTypeWord(word));
    }
}