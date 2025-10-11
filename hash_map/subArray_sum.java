// public class subArray_sum {

//     public static int subArraySum(int[] arr, int k) {
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {
//             int sum = 0; // reset sum for new subarray start
//             for (int j = i; j < arr.length; j++) {
//                 sum += arr[j]; // add next element
//                 if (sum == k) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int k = 3;
//         int result = subArraySum(arr, k);

//         System.out.println(result); 
//     }
// }







public class subArray_sum {

    public static int subArraySum(int[] arr, int k) {
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < arr.length) {
            sum =sum + arr[right];

            // shrink the window from the left if sum > k
            while (sum > k && left <= right) {
                sum  = sum - arr[left];
                left++;
            }
            if (sum == k) {
                count++;
            }

            right++;

        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        System.out.println(subArraySum(arr, k)); // ✅ Output: 2 → [1,2], [3]
    }
}

