
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        // map.put("India", 100);
        // map.put("China", 150);
        // map.put("USA", 50);
        // System.out.println(map);
        // if(map.containsKey("India")){
        //     System.out.println("present");
        // }else{
        //     System.out.println("not present");
        
        // }
        // System.out.println(map.get("India"));
        // System.out.println(map.get("Pakistan")); 
        // int arr[] = {12,13,18};
        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i] + " ");
            
        // }
        // System.out.println();
        // for(int val : arr){
        //     System.out.print(val +  " ");
        // }
        // System.out.println();
        map.put("India", 100);
        map.put("China", 150);
        map.put("USA", 50);
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        // Set<String> keys = map.keySet();
        // for(String key : keys){
        //     System.out.println(key + " " + map.get(key));
        // }
        map.remove("China");
        System.out.println(map);
    }
    
}
