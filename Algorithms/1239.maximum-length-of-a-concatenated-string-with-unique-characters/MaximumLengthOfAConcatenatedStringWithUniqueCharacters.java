import java.util.List;

class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
    private int max = 0;

    private boolean isValid(String currentStr, String newStr) {
        int[] array = new int[26];
        for (int i = 0; i < newStr.length(); i++) {
            if (++array[newStr.charAt(i) - 'a'] == 2) return false;
            if (currentStr.contains(newStr.charAt(i) + ""))
                return false;
        }
        return true;
    }

    private void backtrack(List<String> arr, String current, int start) {
        if (max < current.length())
            max = current.length();
        for (int i = start; i < arr.size(); i++) {
            if (!isValid(current, arr.get(i))) continue;
            backtrack(arr, current + arr.get(i), i + 1);
        }
    }

    public int maxLength(List<String> arr) {
        backtrack(arr, "", 0);
        return max;
    }
}