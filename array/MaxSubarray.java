package array;

public class MaxSubarray {
    public static void main(String[] args){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int n =nums.length;
        int ans  =nums[0];
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(ans);

    }
    
    
}
