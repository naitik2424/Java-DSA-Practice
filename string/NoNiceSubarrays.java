package string;

public class NoNiceSubarrays {
    public static int numberOfSubarrays(int[] nums, int k) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int odd=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2!=0){
                    odd++;
                }
                if(odd==k){
                    cnt++;
                }else if(odd>k){
                    break;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] nums={1,1,2,1,1};
        int k=3;
        System.out.println(numberOfSubarrays(nums,k));
    }
    
}
