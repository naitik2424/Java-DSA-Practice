package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LC347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new 
        PriorityQueue<>((a,b)->a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }

        }
        int[] ans = new int[k];
        for(int i = k-1;i>=0;i--){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
