package array;

import java.util.*;
class SortByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] %2==0){
                arr[index] = nums[i];
                index++;
            }else{
                arr[n-1] =nums[i];
                n--; 
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
