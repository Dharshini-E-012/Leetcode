class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int n = left; n <= right; n++) {
            int temp = n;
            boolean valid = true;
            while(temp > 0) {
                int digit = temp % 10;
                if(digit == 0 || n % digit != 0) {
                    valid = false;
                    break;
                }
                temp /= 10;
            }
            if(valid) 
                ans.add(n);
        }
        return ans;
    }
}