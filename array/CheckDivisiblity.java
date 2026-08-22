package array;
class CheckDivisibility {
    public static boolean checkDivisibility(int n) {
        int sum=0;
        int temp =n;
        int mul=1;
        while(n>0){
            int digit = n%10;
            mul *= digit;
            sum +=digit; 
            n =n/10;
        }
        boolean ok =true;
        if(temp %(mul+ sum) !=0){
            ok =false;
        }
        return ok;
    }
    public static void main(String[] args) {
        int n =99;
        System.out.println(checkDivisibility(n));

    }
}