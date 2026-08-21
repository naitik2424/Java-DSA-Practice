package array;

public class CountNegative {
    public static int countNegatives(int[][] grid) {
        int n =grid.length;
        int count=0;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1}}; 
        System.out.println(countNegatives(grid));
    }

    
    
}
