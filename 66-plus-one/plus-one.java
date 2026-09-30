class Solution {
    public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length + 1];
        boolean carry = false;
        for(int i = 0 ; i < digits.length ; i++){
            if( i == digits.length - 1){
                digits[i]++;
                temp[i + 1] = digits[i];
            }else {
                temp[i + 1] = digits[i] ;
            }
        }
        for(int m = digits.length ; m > 0 ; m--){
            if ( temp[m] > 9){
                temp[m] = 0;
                temp[m - 1 ] = temp[m - 1] + 1;
                carry = true;
            }
        }

        if( carry == true && temp[0] == 1){
            return temp;
        }

        else if( carry == true && temp[0] == 0 ){
            int[] ans = new int[digits.length];
            for( int p = 0 ; p < digits.length ; p++){
                ans[p] = temp[p + 1];
            }
            return ans;
        }
        
        else return digits;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna