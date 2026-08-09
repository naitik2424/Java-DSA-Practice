// Brute force approach
package array;
class RotateMatrix {
    // public static void rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     int[][] ans = new int[n][n];
    //     for(int i=0;i<n;i++){
    //         for(int j =0;j<n;j++){
    //             ans[j][n-1-i] = matrix[i][j];
    //         }
    //     }
    //     for(int i =0;i<n;i++){
    //         for(int  j=0;j<n;j++){
    //             matrix[i][j] = ans[i][j];
    //         }
    //     }
    // }
    public static int transpose(int[][] matrix){
        
        return 0;
    }
    public static void main(String[] args){
        int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = matrix.length;
        // rotate(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%3d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}