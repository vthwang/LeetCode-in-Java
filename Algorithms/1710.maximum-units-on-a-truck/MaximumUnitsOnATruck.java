import java.util.Arrays;

class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int units = 0;
        for (int[] box : boxTypes) {
            if (box[0] >= truckSize) {
                units += truckSize * box[1];
                break;
            } else {
                units += box[0] * box[1];
                truckSize -= box[0];
            }
        }

        return units;
    }
}