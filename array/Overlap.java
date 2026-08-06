package array;
import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            int currentStart = arr[i][0];
            int currentEnd = arr[i][1];
            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }
            else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                ans.add(temp);
                start = currentStart;
                end = currentEnd;
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(start);
        temp.add(end);
        ans.add(temp);
        return ans;
    }
    public static void main(String[] args){
        int[][] arr= {{1,3},{2,4},{6,8},{9,10}};
        System.out.print(mergeOverlap(arr));
    }
}