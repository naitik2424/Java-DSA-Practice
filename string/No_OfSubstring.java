package string;
class No_OfSubstring{
    public static int numberOfSubstrings(String s) {
        int cnt=0;
        int n = s.length();
        int[] lastseen={-1,-1,-1};
        for(int i=0;i<n;i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0] != -1 && lastseen[1] != -1 && lastseen[2] !=-1){
                cnt += 1 + Math.min(Math.min(lastseen[0], lastseen[1]), lastseen[2]);
            }
        }


        return cnt;
        // T.c = O(n2)
        // S.c = O(n2)
        // for(int i=0;i<n;i++){
        //     int[] hash = new int[3];
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'a']=1;
        //         if(hash[0]+hash[1]+hash[2]==3){
        //             cnt += (n-j);
        //             break;
        //         }
        //     }
        // } 
        // return cnt;

        // T.c = O(N2)
        // S.c = O(1)
        // int cnt = 0;
        // int n = s.length();
        // for(int i=0;i<n;i++){
        //     int[] hash = new int[3];
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'a'] =1;
        //         if(hash[1]+hash[0]+hash[2] ==3){
        //             cnt++;
        //         }
        //     }

        // }
        // return cnt;
    }
    public static void main(String[] args){
        String s = "bbacba";
        System.out.println("Number of substring containing all three characters : " + numberOfSubstrings(s));

    }
}