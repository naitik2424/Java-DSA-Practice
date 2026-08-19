package hashmap;
import java.util.*;
class CinemaSeatAllocation { 
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) { 
        HashMap<Integer, Set<Integer>> map = new HashMap<>(); 
        for(int[] rs : reservedSeats) { 
            int row = rs[0]; 
            int seat = rs[1]; 

            if(!map.containsKey(row)){ 
                map.put(row, new HashSet<>()); 
            } 

            map.get(row).add(seat); 
        } 
        int result = (n - map.size()) * 2; 
        for(Map.Entry<Integer, Set<Integer>> entry : map.entrySet()){ 
            Set<Integer> bookedseats = entry.getValue(); 

            boolean groupA = !bookedseats.contains(2) 
                          && !bookedseats.contains(3) 
                          && !bookedseats.contains(4) 
                          && !bookedseats.contains(5); 

            boolean groupB = !bookedseats.contains(4) 
                          && !bookedseats.contains(5) 
                          && !bookedseats.contains(6) 
                          && !bookedseats.contains(7); 

            boolean groupC = !bookedseats.contains(6) 
                          && !bookedseats.contains(7) 
                          && !bookedseats.contains(8) 
                          && !bookedseats.contains(9); 

            if(groupA && groupC){ 
                result += 2; 
            }
            else if(groupA || groupB || groupC){ 
                result += 1; 
            } 
        } 
        return result; 
    } 
    public static void main(String[] args) {
        int n =3;
        int[][] reservedSeats = {
        {1, 2},
        {1, 3},
        {1, 8},
        {2, 6},
        {3, 1},
        {3, 10}
        };
        System.out.println(maxNumberOfFamilies(n, reservedSeats));    }
}