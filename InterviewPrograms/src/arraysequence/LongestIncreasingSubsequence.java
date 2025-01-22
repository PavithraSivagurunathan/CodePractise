package arraysequence;

import java.util.*;

public class LongestIncreasingSubsequence {
    
    // Function to find the Longest Increasing Subsequence
    public static List<Integer> findLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        
        // Length of the input array
        int n = nums.length;
        System.out.println(n);
        // dp array to store the length of LIS ending at each index
        int[] dp = new int[n];
        System.out.println(dp.length);
        // Parent array to reconstruct the LIS
        int[] parent = new int[n];
        System.out.println(parent.length);
        // Initialize dp and parent arrays
        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);
        
        int maxLength = 1;
        int maxIndex = 0;
        
        // Compute LIS length for each index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
            
            // Update the maximum length of LIS
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }
        
        // Reconstruct the longest increasing subsequence
        List<Integer> lis = new ArrayList<>();
        for (int i = maxIndex; i >= 0; i = parent[i]) {
            lis.add(nums[i]);
            if (parent[i] == -1) break;
        }
        
        // Reverse the list to get the correct order
        Collections.reverse(lis);
        
        return lis;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] nums = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        
        List<Integer> lis = findLIS(nums);
        
        System.out.println("Longest Increasing Subsequence: " + lis);
    }
}