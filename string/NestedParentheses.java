package string;

class NestedParentheses {
    public static int maxDepth(String s) {
        int maxcnt = 0;
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cnt++;
            } else if (ch == ')') {
                maxcnt = Math.max(maxcnt, cnt);
                cnt--;
            }
        }
        return maxcnt;

    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));

        s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
}