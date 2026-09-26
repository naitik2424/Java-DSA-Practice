package array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        RemoveElement solver = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = solver.removeElement(nums, val);
        System.out.println("New length: " + k);
        System.out.print("Array after removing element " + val + ": ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}

