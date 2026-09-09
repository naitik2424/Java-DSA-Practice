package string;

// 345. Reverse vowels of a string
class ReverseVowel{
    public static String reverseVowels(String s) {
        int n=s.length();
        int r=n-1,l=0;
        String vowels = "aeiouAEIOU";
        char[] arr =s.toCharArray();
        while(l<r){
            if(vowels.indexOf(arr[l]) ==-1){
                l++;
            }else if(vowels.indexOf(arr[r])==-1){
                r--;
            }else{
                char temp =arr[l];
                arr[l] =arr[r];
                arr[r] =temp;
                l++;
                r--;

            }

        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}