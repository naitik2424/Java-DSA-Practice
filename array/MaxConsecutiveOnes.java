package array;
public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        int cnt=0;
        int n = arr.length;
        int max = 0;
        for(int i =0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
                max = Math.max(max,cnt);

            }else{
                cnt=0;
            }
        }
        System.out.println(max);
    }
    
}
