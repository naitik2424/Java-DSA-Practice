package array;
//  this is a Optimized approach
public class LongestSubArraySumK2 {
    public static int longestSubArraySumk(int[] arr,int k){
        int maxLen =0;
        int left=0;
        int right=0;
        int sum=0;
        int n =arr.length-1;
        while(right<n){
            while(left <=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            sum += arr[right];

        }
        return maxLen;
    } 
    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,1};
        int k =3;
        System.out.print("The longest SubArray with sum k is :");
        System.out.println(longestSubArraySumk(arr,k));

    }
    
}
