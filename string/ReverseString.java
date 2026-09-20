package string;
class ReverseString {
    public static int reverseDegree(String s) {
        char[] arr=s.toCharArray();
        int num=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            num = 26 -(ch-'a');
            int index =i+1;
            sum +=num*index;

        }
        return sum;
    }
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(reverseDegree(s));
    }
}