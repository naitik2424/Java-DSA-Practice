package array;

public class MoveNegative {
    public static void main(String[] args){
        int index=0;
        int[] arr = {-21,13,19,-15,100};
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                temp[index++] = arr[i];
            }
            
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                temp[index++] = arr[i];
            }
            
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
