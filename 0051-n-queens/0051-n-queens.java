class Solution {
    public List<List<String>> list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(arr[i],'.');
            }
        }
        backtrack(arr,0);
        return list;
    }
    public void backtrack(char[][] arr,int row){
        if(row==arr.length){
            ArrayList<String> l=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(new String(arr[i]));
            }
            list.add(l);
            return;
        }
        for(int col=0;col<arr[row].length;col++){
            if(issafe(arr,row,col)){
                arr[row][col]='Q';
                backtrack(arr,row+1);
                arr[row][col]='.';
            }
        }
    }
    public boolean issafe(char[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q')
                return false;
            for(int j=0;j<arr[row].length;j++){
                if(arr[i][j]=='Q'){
                    if(Math.abs(row-i)==Math.abs(col-j))
                        return false;
                }
            }
        }
        return true;
    }
}