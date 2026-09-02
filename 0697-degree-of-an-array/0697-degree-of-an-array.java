import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);

            count.put(num, count.getOrDefault(num, 0) + 1);

            degree = Math.max(degree, count.get(num));
        }

        int answer = nums.length;

        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int length = last.get(num) - first.get(num) + 1;
                answer = Math.min(answer, length);
            }
        }

        return answer;
    }
}