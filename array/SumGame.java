package array;
class SumGame {
    public static boolean sumGame(String num) {
        int n = num.length();
        int leftKnownSum=0;
        int rightKnownSum =0;
        int leftQnMarkCount=0;
        int rightQnMarkCount=0;
        for(int i=0;i<n;i++){
            char c = num.charAt(i);
            if(c=='?'){
                if(i<n/2){
                    leftQnMarkCount++;

                }else{
                    rightQnMarkCount++;
                }
            }else{
                if(i<n/2){
                    leftKnownSum+=c-'0';

                }else{
                    rightKnownSum+=c-'0';
                }
            }
        }
        int totalQnMarks = leftQnMarkCount + rightQnMarkCount;
        if(totalQnMarks%2 == 1){
            return true;
        }
        int Left = 2*leftKnownSum + 9*leftQnMarkCount;
        int Right = 2*rightKnownSum +9*rightQnMarkCount;
        if(Left == Right){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String num = "5023";
        System.out.println(sumGame(num));
    }
}