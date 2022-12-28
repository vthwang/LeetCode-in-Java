import java.util.PriorityQueue;

class RemoveStonesToMinimizeTheTotal {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < piles.length; i++)
            pq.add(piles[i]);

        for (int i = 0; i < k; i++) {
            int stone = pq.remove();
            pq.add(stone - (stone / 2));
        }

        int stones = 0;
        for (int stone : pq)
            stones += stone;

        return stones;
    }
}