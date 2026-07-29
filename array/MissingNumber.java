package array;
// better approach

// public class MissingNumber{
//     public static void main(String[] args){
//         int nums[] = {1,0,3};
//         int n = nums.length;
//         int sum1 = 0;
//         for(int i=0;i<n;i++){
//             sum1 += nums[i];
//         }
//         int sum2 = (n*(n+1))/2;
//         System.out.println(sum2 - sum1);
//     }
// }

// optimized approach
public class MissingNumber{
    public static void main(String[] args){
        int nums[] = {1,0,3};
        int xor1=0,xor2=0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            xor2 ^= nums[i];
            xor1 ^= i;
        }
        xor1 ^=n;
        System.out.println(xor1^xor2);
    }
}