package array;
class SqrtOfX{
    public static void main(String[] args){
        int x =25;
        int left =1;
        int right=x/2;
        int ans=1;
        while(left<=right){
            int mid = (left+right)/2;
            if(mid<=x/mid){
                left = mid+1;
                ans = mid;

            }else{
                right = mid-1;
            }
        }
        System.out.println(ans);
    }
}