package array;
// optimized approach
public class RotateArrayByDplace2 {
    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums,int d){
        int n = nums.length;
        d=d%n;
        reverse(nums,0,d-1);
        reverse(nums,d,n-1);
        reverse(nums,0,n-1);
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int d = 3;
        rotate(nums, d);
        System.out.println("Array after left rotation: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
    
}
// t.c = O(2n) and s.c = O(1)