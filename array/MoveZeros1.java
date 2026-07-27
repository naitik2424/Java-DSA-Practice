package array;
// Brute force approach

public class MoveZeros1 {

    public static void main(String[] args){
        int[] arr = {1, 0, 2, 0, 0, 3, 4};
        int n = arr.length;
        int j =0;
        int temp[] = new int[n];
        for(int i = 0;i<n;i++){
            if(arr[i] !=0){
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i =0;i<temp.length;i++){
            arr[i] = temp[i];
        }
        for(int i = temp.length;i<n;i++){
            arr[i] = 0;
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

// t.c = O(2n) and s.c = O(n)
