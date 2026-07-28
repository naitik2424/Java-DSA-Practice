package array;

import java.util.*;

public class Union {

    public static List<Integer> union(int[] arr1, int[] arr2){
    HashSet<Integer> set = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        set.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        set.add(arr2[i]);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int num : set){
        ans.add(num);
    }
    Collections.sort(ans);
    return ans;

    }
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,4};
        int[] arr2= {2,3,4,4,5,6};
        List<Integer> result = union(arr1, arr2);
        System.out.println(result);
    }    

}
