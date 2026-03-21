public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        for(int p : piles)
            right = Math.max(right, p);

        while(left < right){

            int mid = left + (right - left) / 2;

            int hours = 0;

            for(int p : piles){
                hours += (p + mid - 1) / mid;
            }

            if(hours <= h){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args){

        int[] piles = {3,6,7,11};
        int h = 8;

        KokoEatingBananas obj = new KokoEatingBananas();

        System.out.println("Min Speed: " +
                obj.minEatingSpeed(piles, h));
    }
}