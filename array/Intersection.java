package array;
// Intersection of two sorted arrays
public class Intersection {
    public static int[] intersection(int[] a,int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int[] ans = new int[n1];
        int k = 0;
        int i = 0, j = 0;
        while(i<n1 && j<n2){
            if(a[i] == b[j]){
                ans[k] = a[i];
                k++;
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
        // for(int i =0;i<n1;i++){
        //     for(int j = 0;j<n2;j++){
        //         if(a[i] ==b[j]){
        //             ans[k] = a[i];
        //             k++;
        //         }
        //     }
        // }
    }
    public static void main(String[] args){
        int[] a = {1,2,2,3,4};
        int[] b = {2,3,4,4,5,6};
        int[] result = intersection(a,b);
        for(int i = 0;i<result.length;i++){
            if(result[i] != 0){
                System.out.print(result[i]+" ");
            }
        }
    }

    
}
