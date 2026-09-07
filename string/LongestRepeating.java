package string;
// longest reapting character replacement
class LongestRepeating {
    public static int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int r=0,l=0;
        int maxf=0;
        int[] hash = new int[26];
        while(r<n){
            hash[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r)-'A']);
            // if((r-l+1)-maxf > k){
            while((r-l+1)-maxf > k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }


        // T.C = O(n2)
        // S.C =O(26)
        // for (int i = 0; i < n; i++) {
        //     int[] hash = new int[26];
        //     int maxi = 0;
        //     for (int j = i; j < n; j++) {
        //         hash[s.charAt(j) - 'A']++;
        //         maxi = Math.max(maxi, hash[s.charAt(j) - 'A']);
        //         int changes = (j - i + 1) - maxi;
        //         if (changes <= k) {
        //             maxlen = Math.max(maxlen, j - i + 1);
        //         } 
        //         else {
        //             break;
        //         }
        //     }
        // }
        return maxlen;
    }

    public static void main(String[] args) {
        int k=2;
        String s ="AABABBA";
        System.out.println("Longest Repeating character replacement : "+characterReplacement(s,k));
        
    }
}
