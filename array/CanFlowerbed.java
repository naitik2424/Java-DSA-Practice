package array;


class CanFlowerbed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {

            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == len - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
        
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }

}