/**
 * dp[i][j] = dp[i-1][j] + dp[i][j-1] ( ij的左邊&上面 )
 * 0:  1  1  1  1
 * 1:  1  2  3  4
 * 2:  1  3  6 10
 * 3:  1  4 10 20
 */
public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++)
        dp[i][0] = 1;
        for (int i = 0; i < n; i++)
        dp[0][i] = 1;

        for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++)
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        }
        return dp[m - 1][n - 1];
}