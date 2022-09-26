public static int lengthOfLIS(int[] nums) {
        /**
         * 以數量作爲index(=i)，再將nums中的 i 跟 j 做比較
         * 也就是跟前面的值做比較， 如果大過:自己的dp則以該dp[j]+1
         */
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
        for (int j = 0; j < i; j++)
        if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
        dp[i] = dp[j] + 1;
        max = Math.max(max, dp[i]);
        }
        for (int d : dp) {
        System.out.print(d);
        System.out.print("|");
        }
        System.out.println();
        }
        return max;
        }
/**EXAMPLE
 * {1,2,3,4}   {1,3,2,2,4}   {3,2,1}
 *  ^ ^ ^ ^     ^ ^     ^     ^
 * 1|2|1|1|     1|2|1|1|1|    1|1|1|
 * 1|2|3|1|     1|2|2|1|1|    1|1|1|
 * 1|2|3|4|     1|2|2|2|1|
 *              1|2|2|2|3|
 */