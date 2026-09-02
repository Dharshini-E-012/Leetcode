import java.util.*;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for (int a : aliceSizes) {
            sumA += a;
        }

        for (int b : bobSizes) {
            sumB += b;
        }

        int difference = (sumA - sumB) / 2;

        HashSet<Integer> bob = new HashSet<>();

        for (int b : bobSizes) {
            bob.add(b);
        }

        for (int a : aliceSizes) {
            int b = a - difference;

            if (bob.contains(b)) {
                return new int[]{a, b};
            }
        }

        return new int[0];
    }
}