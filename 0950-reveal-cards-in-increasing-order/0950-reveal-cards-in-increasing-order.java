class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
            q.offer(i);
        int[] arr=new int[n];
        for(int val:deck){
            int index=q.poll();
            arr[index]=val;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return arr;
    }

}