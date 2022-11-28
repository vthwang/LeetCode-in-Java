import java.util.*;

class FindPlayersWithZeroOrOneLosses {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> lossesCnt = new HashMap<>();

        for (int[] match : matches) {
            lossesCnt.put(match[0], lossesCnt.getOrDefault(match[0], 0));
            lossesCnt.put(match[1], lossesCnt.getOrDefault(match[1], 0) + 1);
        }

        List<List<Integer>> ans = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for (Integer player : lossesCnt.keySet()) {
            if (lossesCnt.get(player) == 0) {
                ans.get(0).add(player);
            } else if (lossesCnt.get(player) == 1) {
                ans.get(1).add(player);
            }
        }

        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));

        return ans;
    }
}