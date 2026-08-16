package array;
class StoneGameIX {
    public static boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];
        for (int num : stones) {
            count[num % 3]++;
        }
        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        }
        return Math.abs(count[1] - count[2]) > 2;
    }
    public static void main(String[] args) {
        int[] stones = {1,2,1,1};
        System.out.println(stoneGameIX(stones));
    }
}