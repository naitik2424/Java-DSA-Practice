package array;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            if (seen.containsKey(needed)) {
                return new int[]{seen.get(needed), i};
            }

            seen.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
     public static int[] twoSum2(int[] nums,int target){
        int n = nums.length;
        int left =0,right=n-1;
        for(int i=0;i<n;i++){
            while(left<right){
                if(nums[left]+nums[right] == target){
                    return new int[]{left,right};
                }
                else if(nums[left]+nums[right]<target){
                    left++;
                }else{
                    right--;

                }
            }
        }
        return new int[]{-1,-1};

     }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 26;

        int[] result = twoSum2(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}



// t.c = o(n)  unordered_map 
// t.c = o(nlogn)  sort + two pointer optimized one (twoSum2)
// t.c = o(n^2)  brute force or in worst case
// s.c = o(n)  unordered_map
// s.c = o(1)  two pointer optimized one (twoSum2)