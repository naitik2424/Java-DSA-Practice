package array;
public class ImageSmoother {
    public static int[][] imageSmoother(int[][] img){
        int n=img.length;
        int m=img[0].length;
        int[][] mat = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int sum=0,count=0;
                for(int x=i-1;x<=i+1;x++){
                    for(int y=j-1;y<=j+1;y++){
                        if(x>=0 && x<n && y>=0 && y<m){
                            sum+=img[x][y];
                            count++;
                        }
                    }
                }
                mat[i][j]= sum/count;
                
                
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int[][] img= {{100,200,300},{200,50,200},{100,200,100}};
        int[][] ans =imageSmoother(img);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
