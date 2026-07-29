package array;

import java.util.*;

// optimized approach
public class Union2 {
    public static int[] union(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2= arr2.length;
        int i = 0;
        int j=0;
        List<Integer> ans = new ArrayList<>();
        while(i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                if(ans.isEmpty() || ans.get(ans.size()-1) != arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            } else {
                if(ans.isEmpty() || ans.get(ans.size()-1) != arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        // Add any remaining elements from either array
        while(i < n1){
            if(ans.isEmpty() || ans.get(ans.size()-1) != arr1[i]){
                ans.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(ans.isEmpty() || ans.get(ans.size()-1) != arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        // Convert ArrayList to array
        int[] result = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            result[k] = ans.get(k);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,2,3,4};
        int[] arr2= {2,3,4,4,5,6};
        int[] result = union(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}

// t.c = O(n1+n2) and s.c = O(n1+n2)