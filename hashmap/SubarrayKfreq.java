// 2958. Lenght of longest subarray with at most k frequency


package hashmap;
import java.util.*;

class SubarrayKfreq {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3,1,2};
        int k =2;
        int left=0,len=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            len = Math.max(len,right-left+1);
        }
        System.out.println(len);
    }
}
