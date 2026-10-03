class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean equal;
        String a = "" ;
        String b = "" ;

        for( int i = 0 ; i < word1.length; i++ ){
            a += word1[i];
        }
        for( int m = 0 ; m < word2.length; m++ ){
            b += word2[m];
        }

        if ( a.equals(b) ) return equal = true;
        else return equal = false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna