// /// 1. you have given 0 to n number find missing number and time (n)  and space (1)


// // public class CyclicSort {

// //   public static void main(String []args){

// //     int [] arr = {1,5,3,4,6,8,7,9};
// //     int i =0;

// //     while (i < arr.length){

// //       int correct = arr[i] - 1;

// //       if (arr[i] != arr[correct]){

// //         swap(arr[i] , arr[correct],arr);
// //       }

// //     }

// //     System.out.println(arr);

    


// //   }

// //   static void swap(int i , int j, int []arr){

// //     int temp =  arr[i];
// //     arr[i] = arr[j];

// //     arr[j] = temp;


// //   }




// // }



// /// 2 find the missing number from the given array , while given array is from 0 to n;
// /// 
// //

// import java.util.Arrays;

// public class CyclicSort {

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 1, 5, 3, 7, 9, 10, 6};
//         Arrays.sort(arr);

//         int i = 0;
//         while (i < arr.length) {
//             int correct = arr[i] - 1;

//             //  Check: element must be in range [1, arr.length]
//             if ( arr[i] != arr[correct]) {
//                 swap(i, correct, arr);
//             } else {
//                 i++;
//             }
//         }

//         //  Print sorted array
//         System.out.print("Sorted array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();

//         // Identify missing numbers safely
//         for (i = 0; i < arr.length-1; i++) {
//             if (arr[i] != i + 1) {
//                 System.out.println("Missing or misplaced number: " + (i + 1));
//             }
//         }
//     }

//     public static void swap(int i, int j, int[] arr) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }





import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 5, 3, 7, 9, 10, 6};

        Arrays.sort(arr);

      
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Missing or misplaced number: " + (i + 1));
                break;
            }
        }
    }
}
