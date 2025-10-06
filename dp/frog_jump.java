// import java.util.*;

// public class frog_jump {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of the staires : ");
//         int n = sc.nextInt();
//         int[] dp = new int[n + 2];

//         dp[0] = 1;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2] + dp[i-3];
//         }

//         System.out.println(dp[n]);
//     }
// }


// can jump 1 , 2, 3
// import java.util.*;

// public class frog_jump {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of stairs: ");
//         int n = sc.nextInt();

//         // handle small cases directly
//         if (n == 0) {
//             System.out.println(1);
//             return;
//         } else if (n == 1) {
//             System.out.println(1);
//             return;
//         } else if (n == 2) {
//             System.out.println(2);
//             return;
//         }

//         int[] dp = new int[n + 1];

//         // base cases
//         dp[0] = 1;
//         dp[1] = 1;
//         dp[2] = 2;

//         // fill dp table
//         for (int i = 3; i <= n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
//         }

//         System.out.println("Number of ways to reach stair " + n + " = " + dp[n]);
//     }
// }


// problem 2 
/*  Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair. At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.*/

// memoization 



import java.util.*;
class frog_jump{
static int solve(int n,int[] height,int[] dp){
    if(n==0) return 0;
    if(dp[n]!=-1) return dp[n];
    int jumpTwo = Integer.MAX_VALUE;

    int jumpOne= solve(n-1, height,dp)+ Math.abs(height[n]-height[n-1]);

    if(n>1)
        jumpTwo = solve(n-2, height,dp)+ Math.abs(height[n]-height[n-2]);
    return dp[n]=Math.min(jumpOne, jumpTwo);
}

public static void main(String args[]) {

  int height[]={30,10,60 , 10 , 60 , 50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,-1);

  System.out.println(solve(n-1,height,dp));
}
}


// if also find path that give minimum energy:
// import java.util.*;

// class frog_jump {

//     static int solve(int n, int[] height, int[] dp, int[] path) {
//         if (n == 0) return 0;
//         if (dp[n] != -1) return dp[n];

//         int jumpOne = solve(n - 1, height, dp, path) + Math.abs(height[n] - height[n - 1]);
//         int jumpTwo = Integer.MAX_VALUE;

//         if (n > 1)
//             jumpTwo = solve(n - 2, height, dp, path) + Math.abs(height[n] - height[n - 2]);

//         if (jumpOne <= jumpTwo) {
//             dp[n] = jumpOne;
//             path[n] = n - 1; // came from n-1
//         } else {
//             dp[n] = jumpTwo;
//             path[n] = n - 2; // came from n-2
//         }

//         return dp[n];
//     }

//     public static void main(String[] args) {
//         int[] height = {30, 10, 60, 10, 60, 50};
//         int n = height.length;
//         int[] dp = new int[n];
//         int[] path = new int[n];
//         Arrays.fill(dp, -1);
//         Arrays.fill(path, -1);

//         int minEnergy = solve(n - 1, height, dp, path);

//         // reconstruct the path
//         List<Integer> route = new ArrayList<>();
//         int i = n - 1;
//         route.add(i);
//         while (i > 0) {
//             i = path[i];
//             route.add(i);
//         }
//         Collections.reverse(route);

//         System.out.println("Minimum Energy: " + minEnergy);
//         System.out.print("Path (indices): ");
//         for (int idx : route) {
//             System.out.print(idx + " ");
//         }
//         System.out.println();
//     }
// }


// tabulation 

// import java.util.*;
// class TUF{
// public static void main(String args[]) {

//   int height[]={30,10,60,10,60,50};
//   int n=height.length;
//   int dp[]=new int[n];
//   Arrays.fill(dp,-1);
//   dp[0]=0;
//   for(int n=1;n<n;n++){
//       int jumpTwo = Integer.MAX_VALUE;
//         int jumpOne= dp[n-1] + Math.abs(height[n]-height[n-1]);
//         if(n>1)
//             jumpTwo = dp[n-2] + Math.abs(height[n]-height[n-2]);
    
//         dp[n]=Math.min(jumpOne, jumpTwo);
//   }
//   System.out.println(dp[n-1]);
// }
// }




// problem 2
// we will learn about  Frog Jump with k Distances (DP 4)"
// Problem Statement:  Frog Jump with K Distance
// Problem Statement:

/*This is a follow-up question to Frog Jump discussed in the previous article. In the previous question, the frog  
//////allowed to jump either one or two steps at a time. In this question, the frog is allowed to jump up to ‘K’ steps at 
/// //time. If K=4, the frog can jump 1,2,3, or 4 steps at every nex.*/

// Pre-req: Frog Jump

// Disclaimer: Don’t jump directly to the solution, try it out yourself first.



//  memoization 
// import java.util.*;

// class TUF {
//     // Recursive function to calculate the minimum cost to reach the end
//     // from a given nex with at most 'k' jumps.
//     static int solveUtil(int n, int[] height, int[] dp, int k) {
//         // Base case: If we are at the beginning (nex 0), no cost is needed.
//         if (n == 0)
//             return 0;

//         // If the result for this nex has been previously calculated, return it.
//         if (dp[n] != -1)
//             return dp[n];

//         int mmSteps = Integer.MAX_VALUE;

//         // Loop to try all possible jumps from '1' to 'k'
//         for (int j = 1; j <= k; j++) {
//             // Ensure that we do not jump beyond the beginning of the array
//             if (n - j >= 0) {
//                 // Calculate the cost for this jump and update mmSteps with the minimum cost
//                 int jump = solveUtil(n - j, height, dp, k) + Math.abs(height[n] - height[n - j]);
//                 mmSteps = Math.min(jump, mmSteps);
//             }
//         }

//         // Store the minimum cost for this nex in the dp array and return it.
//         return dp[n] = mmSteps;
//     }

//     // Function to fn the minimum cost to reach the end of the array
//     static int solve(int n, int[] height, int k) {
//         int[] dp = new int[n];
//         Arrays.fill(dp, -1); // Initialize a memoization array to store calculated results
//         return solveUtil(n - 1, height, dp, k); // Start the recursion from the last nex
//     }

//     public static void main(String args[]) {
//         int height[] = { 30, 10, 60, 10, 60, 50 };
//         int n = height.length;
//         int k = 2;
//         System.out.println(solve(n, height, k)); // Print the result of the solve function
//     }
// }



// tabulation 


// import java.util.*;

// class TUF {
//     // Function to fn the minimum cost to reach the end using at most 'k' jumps
//     static int solveUtil(int n, int[] height, int[] dp, int k) {
//         dp[0] = 0;

//         // Loop through the array to fill in the dp array
//         for (int i = 1; i < n; i++) {
//             int mmSteps = Integer.MAX_VALUE;

//             // Loop to try all possible jumps from '1' to 'k'
//             for (int j = 1; j <= k; j++) {
//                 if (i - j >= 0) {
//                     int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
//                     mmSteps = Math.min(jump, mmSteps);
//                 }
//             }
//             dp[i] = mmSteps;
//         }
//         return dp[n - 1]; 
//     }

//     // Function to fn the minimum cost to reach the end of the array
//     static int solve(int n, int[] height, int k) {
//         int[] dp = new int[n]; // Initialize a memoization array to store calculated results
//         Arrays.fill(dp, -1);
//         return solveUtil(n, height, dp, k);
//     }

//     public static void main(String args[]) {
//         int height[] = {30, 10, 60, 10, 60, 50};
//         int n = height.length;
//         int k = 2;
//         System.out.println(solve(n, height, k)); // Print the result of the solve function
//     }
// }





