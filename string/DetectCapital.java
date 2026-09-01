package string;
class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        int capital=0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                capital++;
            }
        }
        if(capital==word.length()){
            return true;
        }
        if(capital==0){
            return true;
        }
        if(capital==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;



        // boolean case1=true;
        // for(char ch: word.toCharArray()){
        //     if(!Character.isUpperCase(ch)){
        //         case1 =false;
        //         break;
        //     }
        // }
        // boolean case2=true;
        // for(char ch : word.toCharArray()){
        //     if(!Character.isLowerCase(ch)){
        //         case2=false;
        //         break;
        //     }
        // }
        // boolean case3 = true;
        // if(!Character.isUpperCase(word.charAt(0))){
        //         case3=false;
        // }
        // if(case3){
        //     for(int i=1;i<word.length();i++){
        //     if(!Character.isLowerCase(word.charAt(i))){
        //         case3=false;
        //         break;
        //     }

        // }}
        // return case1 || case2 || case3;
    }
    public static void main(String[] args) {
        String word = "India";
        System.out.println("word is : "+detectCapitalUse(word));
    }
}