// n this article, we will solve the most asked coding interview problem: Grid Unique Paths

// Given two values M and N, which represent a matrix[M][N]. We need to find the total unique paths from the top-left cell (matrix[0][0]) to the rightmost cell (matrix[M-1][N-1]).

// At any cell we are allowed to move in only two directions:- bottom and right.


// memoization

import java.util.*;

class Grid_unique {


    static int countWays(int i , int j , int[] [] dp){

        if (i ==0 && j == 0 ){
            return 1;
        }

        if (i < 0 || j< 0 ){
            return 0;
        }

        if (dp[i][j] != -1){
            return dp[i][j];
        }




        int up =countWays(i-1,j,dp);
        int right = countWays(i,j-1,dp);

        return  dp[i][j] = up + right ;
    }

    public static void main(String [] args){

        System.out.println("Enter the value of M : ");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();



        System.out.println("Enter the value of N : ");
        
        int n = sc.nextInt();

        int dp [] [] = new int [m][n];

        for (int [] row : dp){
            Arrays.fill(row,-1);
        }


        System.out.print(countWays(m-1,n-1,dp));

        sc.close();


    }


}


// tabulation
//
// import java.util.*;

// class TUF {
//     // Function to count the number of ways to reach cell (m, n)
//     static int countWaysUtil(int m, int n, int[][] dp) {
//         // Loop through each cell in the grid
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 // Base condition: If we are at the top-left cell (0, 0), there's one way to reach it.
//                 if (i == 0 && j == 0) {
//                     dp[i][j] = 1;
//                     continue;
//                 }

//                 int up = 0;
//                 int left = 0;

//                 // Calculate the number of ways by moving up (if possible) and left (if possible)
//                 if (i > 0)
//                     up = dp[i - 1][j];
//                 if (j > 0)
//                     left = dp[i][j - 1];

//                 // Store the total number of ways to reach the current cell in the DP array
//                 dp[i][j] = up + left;
//             }
//         }

//         // Return the number of ways to reach the bottom-right cell (m-1, n-1)
//         return dp[m - 1][n - 1];
//     }

//     // Function to count the number of ways to reach cell (m, n)
//     static int countWays(int m, int n) {
//         // Create a 2D DP array to store the results
//         int dp[][] = new int[m][n];

//         // Initialize the DP array with -1 to indicate uncomputed values
//         for (int[] row : dp)
//             Arrays.fill(row, -1);

//         // Call the countWaysUtil function to calculate and return the result
//         return countWaysUtil(m, n, dp);
//     }

//     public static void main(String args[]) {
//         int m = 3;
//         int n = 2;

//         // Call the countWays function and print the result
//         System.out.println(countWays(m, n));
//     }
// }
