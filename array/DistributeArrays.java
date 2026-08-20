package array;
class DistributeArrays {
    public static int[] resultArray(int[] nums) {
        int n =nums.length;
        int[] arr1 = new int[n];
        int[] arr2 =new int[n];
        arr1[0] =nums[0];
        arr2[0] =nums[1];
        int last1 =0;
        int last2=0;
        
        for(int i=2;i<n;i++){
            if(arr1[last1]>arr2[last2]){
                last1++;
                arr1[last1] = nums[i];
            }else{
                last2++;
                arr2[last2]=nums[i];
            }
        }
        int index=0;
        for(int i=0;i<=last1;i++){
            nums[index] =arr1[i];
            index++;
        }
        for(int i=0;i<=last2;i++){
            nums[index] = arr2[i];
            index++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        int[] ans = resultArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i] + " ");
        }
        
    }
}