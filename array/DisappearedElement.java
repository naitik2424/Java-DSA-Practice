package array;
import java.util.*;

class DisappearedElement {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        int expected=1;
        for(int num: nums){
            if(num == expected){
                expected++;
            }else if(num>expected){
                while(expected<num){
                    ans.add(expected);
                    expected++;
                }
                expected++;
            }
        }
        while(expected<=nums.length){
            ans.add(expected);
            expected++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}