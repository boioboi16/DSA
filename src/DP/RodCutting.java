package DP;

import java.util.Arrays;

public class RodCutting {

	public static void main(String[] args) {
		//TEST CASE 1
		int arr[] = { 42, 68, 35, 1, 70 };
		int size = arr.length;
		int[] dp = new int[arr.length + 1];
		Arrays.fill(dp, -1);
		System.out.println("Maximum Obtainable Value is " + cutRod(arr, size, dp));

		//TEST CASE 2
		int arr2[] = { 25, 79, 59, 63, 65, 6, 46, 82 };
		int[] dp2 = new int[arr2.length + 1];
		Arrays.fill(dp2, -1);
		System.out.println("Maximum Obtainable Value is " + cutRod(arr2, arr2.length, dp2));

	}

	public static int cutRod(int price[], int n, int dp[]) {
		if (n == 0) {
			return 0;
		}
		if (dp[n] != -1) {
			return dp[n];
		}

		int maxValue = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			maxValue = Math.max(maxValue, cutRod(price, n - i, dp) + price[i - 1]);

		}
		dp[n] = maxValue;
		return maxValue;
	}

}
