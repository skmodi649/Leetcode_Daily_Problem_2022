package July;

public class July_11_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        // checking for the array of length 2
        if(cost.length == 2)
            return Math.min(cost[0], cost[1]);

        int[] dp = new int[cost.length + 1];
        dp[0] = 0; dp[1] = 0;
        for(int i = 2 ; i < dp.length ; i++){
            // To reach index i, the prev index could only be i - 2 or i - 1.
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
