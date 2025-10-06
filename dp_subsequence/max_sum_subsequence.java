


// problem

// In this article we will solve the problem: Maximum sum of non-adjacent elements (DP 5)

// Problem Statement:

// Given an array of ‘N’  positive integers, we need to return the maximum sum of the subsequence such that no two elements of the subsequence are adjacent elements in the array.

// Note: A subsequence of an array is a list with elements of the array where some 
//elements are deleted ( or not deleted at all) and the elements should be in the same 
//order in the subsequence as in the array.

// memoization

import java.util.*;

public class max_sum_subsequence {
    // This function recursively calculates the maximum possible sum
    // by considering or not considering the current element.
    static int solveUtil(int n, int[] arr, int[] dp) {
        // If the nex is negative, there are no elements left to consider.
        if (n < 0) return 0;
        
        // If the nex is 0, there is only one element to consider, so return its value.
        if (n == 0) return arr[n];
        
        // If we have already calculated the result for this nex, return it.
        if (dp[n] != -1) return dp[n];
        
        // Calculate the maximum sum by either picking the current element or not picking it.
        int pick = arr[n] + solveUtil(n - 2, arr, dp);
        int nonPick = solveUtil(n - 1, arr, dp);
        
        // Store the maximum of the two options in the dp array for future reference.
        return dp[n] = Math.max(pick, nonPick);
    }

    // This function initializes the dp array and calls the recursive solver.
    static int solve(int n, int[] arr) {
        int dp[] = new int[n];
        
        // Initialize the dp array with -1 to nicate that values are not calculated yet.
        Arrays.fill(dp, -1);
        
        // Call the recursive solver for the last nex (n-1).
        return solveUtil(n - 1, arr, dp);
    }

    public static void main(String args[]) {
        // Input array with elements.
        int arr[] = {2, 1, 4, 9};
        
        // Get the length of the array.
        int n = arr.length;
        
        // Call the solve function to fn the maximum possible sum.
        int result = solve(n, arr);
        
        // Print the result.
        System.out.println(result);
    }
}



// tabulation 

// import java.util.*;

// class max_sum_subsequence {
//     // This function uses dynamic programming to fn the maximum possible sum of non-adjacent elements.
//     static int solveUtil(int n, int[] arr, int[] dp) {
//         // Initialize the dp array with the first element of the input array.
//         dp[0] = arr[0];

//         // Iterate through the input array to fill the dp array.
//         for (int i = 1; i < n; i++) {
//             // Calculate the maximum sum by either picking the current element or not picking it.
//             int pick = arr[i];
            
//             // If there are at least two elements before the current element, add the value from dp[i-2].
//             if (i > 1)
//                 pick += dp[i - 2];
            
//             // The non-pick option is to use the maximum sum from the previous element.
//             int nonPick = dp[i - 1];

//             // Store the maximum of the two options in the dp array for the current nex.
//             dp[i] = Math.max(pick, nonPick);
//         }

//         // The final element of the dp array contains the maximum possible sum.
//         return dp[n - 1];
//     }

//     // This function initializes the dp array and calls the solver function.
//     static int solve(int n, int[] arr) {
//         int dp[] = new int[n];
        
//         // Initialize the dp array with -1 to nicate that values are not calculated yet.
//         Arrays.fill(dp, -1);
        
//         // Call the solver function to fn the maximum possible sum.
//         return solveUtil(n, arr, dp);
//     }

//     public static void main(String args[]) {
//         // Input array with elements.
//         int arr[] = {2, 1, 4, 9};
        
//         // Get the length of the array.
//         int n = arr.length;
        
//         // Call the solve function to fn the maximum possible sum.
//         int result = solve(n, arr);
        
//         // Print the result.
//         System.out.println(result);
//     }
// }






