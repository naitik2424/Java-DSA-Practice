import java.util.*;

public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {

        // Step 1: Sort envelopes
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0])
                return b[1] - a[1];   // height descending if width same
            return a[0] - b[0];       // width ascending
        });

        // Step 2: Apply LIS on heights
        List<Integer> tails = new ArrayList<>();

        for (int[] env : envelopes) {

            int height = env[1];

            int left = 0;
            int right = tails.size();

            while (left < right) {

                int mid = (left + right) / 2;

                if (tails.get(mid) < height)
                    left = mid + 1;
                else
                    right = mid;
            }

            if (left == tails.size())
                tails.add(height);
            else
                tails.set(left, height);
        }

        return tails.size();
    }

    public static void main(String[] args) {

        int[][] envelopes = {
            {5,4},
            {6,4},
            {6,7},
            {2,3}
        };

        RussianDollEnvelopes obj = new RussianDollEnvelopes();

        int result = obj.maxEnvelopes(envelopes);

        System.out.println("Maximum envelopes that can be nested: " + result);
    }
}