import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuccessfulPairsOfSpellsAndPotionsTest {
    SuccessfulPairsOfSpellsAndPotions successfulPairsOfSpellsAndPotions = new SuccessfulPairsOfSpellsAndPotions();

    @Test
    void Example1() {
        int[] spells = {5, 1, 3}, potions = {1, 2, 3, 4, 5};
        int success = 7;

        Assertions.assertArrayEquals(new int[]{4, 0, 3}, successfulPairsOfSpellsAndPotions.successfulPairs(spells, potions, success));
    }

    @Test
    void Example2() {
        int[] spells = {3, 1, 2}, potions = {8, 5, 8};
        int success = 16;

        Assertions.assertArrayEquals(new int[]{2, 0, 2}, successfulPairsOfSpellsAndPotions.successfulPairs(spells, potions, success));
    }
}
