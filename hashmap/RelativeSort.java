package hashmap;
import java.util.*;
class RelativeSort{
    public static int[] relativeSort(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int num : arr2){
            int count = map.get(num);
            while(count>0){
                arr1[index++] = num;
                count--; 
            }
            map.remove(num);
        }
        ArrayList<Integer> reman = new ArrayList<>();
        for(int num : map.keySet()){
            int count=map.get(num);
            while(count>0){
                reman.add(num);
                count--;
            }
        }
        Collections.sort(reman);
        for(int num : reman){
            arr1[index++] = num;
        }
        return arr1;

    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,2};
        int[] arr2 = {2,1,4,3};
        System.out.println(Arrays.toString(relativeSort(arr1,arr2)));
    }
}