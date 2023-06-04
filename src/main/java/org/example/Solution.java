package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < dp.length; i++) {
            int maxSubSeq = 1;
            for (int j = 0; j < i; j++) {

                if (pairs[j][1] < pairs[i][0]) {
                    maxSubSeq = Math.max(maxSubSeq, dp[j] + 1);
                }
            }
            dp[i] = maxSubSeq;
        }
        System.out.println(Arrays.toString(dp));

        return dp[dp.length - 1];
    }
}
