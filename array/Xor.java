package array;

class Xor {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int n = nums.length;
        int xor = 0;

        for (int num : nums) {
            xor = xor ^ num;
        }

        if (xor != 0) {
            System.out.println(n);
            return;
        }

        for (int num : nums) {
            if (num != 0) {
                System.out.println(n - 1);
                return;
            }
        }

        System.out.println(0);
    }
}