class Solution {
    public int[] twoSum(int[] nums, int target) {
        // checking for leetsync
        int ans=0;
        int a = 0 ;
        int b = 0 ;
        int[] index = { a , b };
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int m = i + 1 ; m < nums.length ; m++){
                if(target == nums[i] + nums[m] ){
                    ans = i + m ;
                    index[0] = i ;
                    index[1] = m ;
                }
            }
        }
        return(index);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna