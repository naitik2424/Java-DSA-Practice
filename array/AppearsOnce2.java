package array;

public class AppearsOnce2 {
    public static void main(String[] args){
        int[] nums={1,1,2,3,3,4,4};
        int xor = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            xor = xor^nums[i];
        }
        System.out.println(xor);
    }
}
