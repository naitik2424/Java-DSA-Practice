package array;
class DigitSumEqualIndex {
    public static int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int sum=0;
            while(num !=0){
                int digit = num%10;
                sum +=digit;
                num =num/10;
            }
            if(i == sum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums= {1,3,2};
        System.out.println(smallestIndex(nums));

    }
}