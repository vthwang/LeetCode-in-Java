import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class LetterCombinationsOfAPhoneNumber {
    private void backtrack(List<String> res, char[] digits, String s, String[] dict) {
        if (s.length() == digits.length) {
            res.add(s);
            return;
        }
        int digit = digits[s.length()] - '0';
        for (char letter : dict[digit].toCharArray()) {
            backtrack(res, digits, s + Character.toString(letter), dict);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) return res;
        String[] dict = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(res, digits.toCharArray(), "", dict);
        return res;
    }
}