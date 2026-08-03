package array;

public class RearrangeBySign {
    public static int[] rearrangeArray(int[] nums) {
        int posIndex =0;
        int n = nums.length;
        int[] ans = new int[n];
        int negIndex=1;
        for(int i =0;i<n;i++){
            if(nums[i]<0){
                ans[negIndex] = nums[i];
                negIndex+=2;
            }else{
                ans[posIndex] = nums[i];
                posIndex+=2; 
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
   

