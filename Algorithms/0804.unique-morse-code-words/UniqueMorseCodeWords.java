import java.util.HashSet;
import java.util.Set;

class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> codeSet = new HashSet<>();
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        int res = 0;
        for (String word : words) {
            String morseCode = "";
            for (char c : word.toCharArray()) {
                morseCode = morseCode.concat(codes[c - 'a']);
            }
            if (!codeSet.contains(morseCode)) {
                codeSet.add(morseCode);
                res++;
            }
        }
        return res;
    }
}