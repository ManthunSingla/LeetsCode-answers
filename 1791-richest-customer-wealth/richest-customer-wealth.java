class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth[] = new int[accounts.length] ;
        int max = 0 ;
        for( int i = 0 ; i < accounts.length ; i++ ){
            for( int m = 0 ; m < accounts[0].length ; m++ ){
                wealth[i] += accounts[i][m];
            }
        }
        for(int p = 0 ; p < wealth.length ; p ++ ){
            if( wealth[p] > max ) max = wealth[p] ;
        }

        return max ;
    }
}