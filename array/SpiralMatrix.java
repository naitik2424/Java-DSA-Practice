package array;

import java.util.*;
class SpiralMatrix{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        int m = matrix[0].length;
        int top=0,right=m-1;
        int left=0;
        int bottom=n-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(top<=bottom && left<=right){
            // right->bottom->left->top
        for(int i=left;i<=right;i++){
            // System.out.println(matrix[top][i]+ " ");
            ans.add(matrix[top][i]);
        }
        top++;
        for(int i =top;i<=bottom;i++){
            // System.out.println(matrix[i][right] +" ");
            ans.add(matrix[i][right]);
        }
        right--;
        for(int i=right;i>=left;i--){
            // System.out.println(matrix[bottom][i]+" ");
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        for(int i=bottom;i>=top;i--){
            // System.out.println(matrix[i][left] + " ");
            ans.add(matrix[i][left]);
        }
        left++;
        }
        System.out.println(ans); 

        
    }
}