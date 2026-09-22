package array;

import java.util.*;

public class KWeakest {

    public static int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        int[][] arr = new int[m][2];

        // Count soldiers in each row
        for (int i = 0; i < m; i++) {

            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    cnt++;
                }
            }

            arr[i][0] = cnt;  // number of soldiers
            arr[i][1] = i;    // row index
        }

        // Sort based on soldiers, then row index
        for (int i = 0; i < m - 1; i++) {

            for (int j = i + 1; j < m; j++) {

                if (arr[i][0] > arr[j][0] ||
                   (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1])) {

                    // Swap soldiers count
                    int temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;

                    // Swap row index
                    temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }

        // Store k weakest rows
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][1];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };

        int k = 3;

        int[] result = kWeakestRows(mat, k);

        System.out.println(Arrays.toString(result));
    }
}