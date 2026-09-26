package array;

public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveDuplicatesII solver = new RemoveDuplicatesII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = solver.removeDuplicates(nums);
        System.out.println("New length: " + k);
        System.out.print("Array elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

