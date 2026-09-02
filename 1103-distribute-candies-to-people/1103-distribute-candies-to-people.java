class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int give = 1;
        int i = 0;

        while (candies > 0) {
            int amount = Math.min(give, candies);

            result[i] += amount;
            candies -= amount;

            give++;
            i++;

            if (i == num_people) {
                i = 0;
            }
        }

        return result;
    }
}