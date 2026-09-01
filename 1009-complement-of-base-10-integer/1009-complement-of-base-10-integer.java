class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
            return 1;
        int num = 0;
        int temp = n;
        while (temp > 0) {
            num = (num << 1) | 1;
            temp = temp>>1;
        }
        return n ^ num;
    }
}