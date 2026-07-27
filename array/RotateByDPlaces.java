package array;

public class RotateByDPlaces {
    public static void rotate(int[] nums,int d){
        int n = nums.length;
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = nums[i];
        }
        for(int i=d;i<n;i++){
            nums[i-d] = nums[i];
        }
        for(int i=n-d;i<n;i++){
            nums[i] = temp[i-n+d];
        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7};
        int d = 2;
        rotate(nums, d);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        


    }
}

