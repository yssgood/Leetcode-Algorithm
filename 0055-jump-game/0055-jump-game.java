class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length]; 
        dp[0] = true; 
        for(int i = 1; i < nums.length; i++){
            for(int j = i -1; j >= 0; j--){
                if(dp[j] == true && j + nums[j] >= i){
                    dp[i] = true; 
                    break; 
                }
            }
        }
        
        return dp[nums.length - 1]; 
    }
}