


































// import java.util.Scanner;

// public class FirstAndLast {

//     public void find_occ(int[] arr, int k) {
//         int first = -1, last = -1; // default values if element not found

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == k) {
//                 if (first == -1) {
//                     first = i; // first occurrence
//                 }
//                 last = i; // keep updating last occurrence
//             }
//         }

//         if (first != -1) {
//             System.out.println("First occurrence of " + k + " is at index: " + first);
//             System.out.println("Last occurrence of " + k + " is at index: " + last);
//         } else {
//             System.out.println("Element " + k + " not found in the array.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take array size
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements of array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             System.out.print("  ,");
//         }

//         System.out.print("Enter element to find: ");
//         int k = sc.nextInt();

//         FirstAndLast f = new FirstAndLast();
//         f.find_occ(arr, k);

//         sc.close();
//     }
// }
