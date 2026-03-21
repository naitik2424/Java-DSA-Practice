import java.util.*;
public class ShipPackages {

    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        // Step 1: define search space
        for(int w : weights){
            left = Math.max(left, w); // minimum capacity
            right += w;               // maximum capacity
        }

        // Step 2: binary search
        while(left < right){

            int mid = left + (right - left) / 2;

            int neededDays = 1;
            int currentLoad = 0;

            // Step 3: check how many days needed
            for(int w : weights){

                if(currentLoad + w > mid){
                    neededDays++;
                    currentLoad = 0;
                }

                currentLoad += w;
            }

            // Step 4: adjust search
            if(neededDays <= days){
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args){

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        ShipPackages obj = new ShipPackages();

        int result = obj.shipWithinDays(weights, days);

        System.out.println("Minimum Capacity: " + result);
    }
}