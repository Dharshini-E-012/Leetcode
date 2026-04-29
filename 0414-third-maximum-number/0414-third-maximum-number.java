class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s=new TreeSet<>();
        for(int n:nums)
            s.add(n);
        if(s.size()<3){
            return s.last();
        }
        s.remove(s.last());
        s.remove(s.last());
        return s.last();
    }
}