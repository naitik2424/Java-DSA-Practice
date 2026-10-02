package string;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        generate("", 0, 0, n, ans);

        return ans;
    }

    public void generate(String s, int open, int close, int n,
            List<String> ans) {

        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        // '(' add kar sakte hain
        if (open < n) {
            generate(s + "(", open + 1, close, n, ans);
        }

        // ')' tabhi add karenge jab koi unmatched '(' ho
        if (close < open) {
            generate(s + ")", open, close + 1, n, ans);
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        int n = 3;
        List<String> ans = gp.generateParenthesis(n);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}