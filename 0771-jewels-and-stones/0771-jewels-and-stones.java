class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        boolean[] res=new boolean[128];
        for(char ch:jewels.toCharArray())
            res[ch]=true;
        for(char ch:stones.toCharArray()){
            if(res[ch])
                c++;
        }
        return c;
    }
}