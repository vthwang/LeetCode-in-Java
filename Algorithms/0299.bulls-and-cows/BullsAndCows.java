import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class BullsAndCows {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                secret = secret.substring(0, i) + secret.substring(i + 1);
                guess = guess.substring(0, i) + guess.substring(i + 1);
                i--;
            }
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : secret.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int cows = 0;
        for (char c : guess.toCharArray()) {
            if (map.containsKey(c) && map.get(c) != 0) {
                cows++;
                map.put(c, map.get(c) - 1);
            }
        }

        return bulls + "A" + cows + "B";
    }
}