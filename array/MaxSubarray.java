package array;
// Kadane's Algorithm
public class MaxSubarray {
    public static void main(String[] args){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum =0;
        int n =nums.length;
        int maxi =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(maxi);
    }
}
// t.c = o(n)
// s.c = o(1)
