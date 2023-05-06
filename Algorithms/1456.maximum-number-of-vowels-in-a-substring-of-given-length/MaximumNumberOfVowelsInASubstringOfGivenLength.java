class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int left = 0;
        int maxVowels = 0, currentVowels = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = Math.max(maxVowels, currentVowels);
        for (int right = k; right < s.length(); right++) {
            if (isVowel(s.charAt(left))) {
                currentVowels--;
            }
            left++;
            if (isVowel(s.charAt(right))) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }
        return maxVowels;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}