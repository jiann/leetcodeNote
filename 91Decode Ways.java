public static int numDecodings(String s) {
        if(s.length() == 0) return 0;
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        dp[1]=s.charAt(0)=='0'?0:1;
        for(int i=2; i<=s.length(); i++){
        //比對當前index的值是否在範圍内(1~26)
        int first = Integer.parseInt(s.substring(i-1,i)); //i為單位
        int second = Integer.parseInt(s.substring(i-2,i));//(i-1,i)為單位
        if(first>0&&first<10)
        dp[i]+=dp[i-1];
        if(second>=10 && second<=26)
        dp[i]+=dp[i-2];
        }
        return dp[s.length()];
}