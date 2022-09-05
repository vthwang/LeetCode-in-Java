import java.util.ArrayList;
import java.util.List;

class LetterCasePermutation {
    private void backtrack(char[] str, int pos, List<String> res) {
        if (pos == str.length) {
            res.add(new String(str));
            return;
        }

        if (Character.isLetter(str[pos])) {
            if (Character.isUpperCase(str[pos])) {
                str[pos] = Character.toLowerCase(str[pos]);
                backtrack(str, pos + 1, res);
                str[pos] = Character.toUpperCase(str[pos]);
            } else {
                str[pos] = Character.toUpperCase(str[pos]);
                backtrack(str, pos + 1, res);
                str[pos] = Character.toLowerCase(str[pos]);
            }
        }
        backtrack(str, pos + 1, res);
    }

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s.toCharArray(), 0, res);
        return res;
    }
}