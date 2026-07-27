package array;

public  class RotateByOnePlace {
    public static void rotate(int nums[]){
        int n = nums.length;
        int temp =nums[0];
        for(int i =1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        System.out.println("before rotation");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        rotate(nums);
        // Print the rotated array
        System.out.println();
        System.out.println("after rotation");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    
}
