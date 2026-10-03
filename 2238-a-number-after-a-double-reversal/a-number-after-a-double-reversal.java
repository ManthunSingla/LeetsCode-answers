class Solution {
    public boolean isSameAfterReversals(int num) {
        int last1 = 0 ;
        int last2 = 0 ;
        int CopyOfNum = num ;
        int reverse1 = 0 ;
        int reverse2 = 0 ;
        while ( CopyOfNum != 0  ){
            last1 = CopyOfNum % 10 ;
            reverse1 = reverse1 * 10 + last1 ;
            CopyOfNum /= 10 ;
        }
        while ( reverse1 != 0  ){
            last2 = reverse1 % 10 ;
            reverse2 = reverse2 * 10 + last2 ;
            reverse1 /= 10 ;
        }

        if ( reverse2 == num ) return true;
        else return false;
    }
}