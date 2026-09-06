package string;
class No_OfSubstring{
    public static int numberOfSubstrings(String s) {
        int cnt = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] hash = new int[3];
            for(int j=i;j<n;j++){
                hash[s.charAt(j)-'a'] =1;
                if(hash[1]+hash[0]+hash[2] ==3){
                    cnt++;
                }
            }

        }
        return cnt;
    }
    public static void main(String[] args){
        String s = "abcba";
        System.out.println("Number of substring containing all three characters : " + numberOfSubstrings(s));

    }
}