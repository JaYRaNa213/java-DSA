import java.util.Scanner;



public class reverse{

  public static void revers_arr(int[]arr){
    int s = 0;

    

    int e  = arr.length-1;

    while(s<e){
      int temp = arr[s];
      arr[s]= arr[e];
      arr[e]= temp;

      s++;
      e--;

    }
  

  
    

  }

  public static void main(String []arg){

    Scanner sc  = new Scanner(System.in);

    int n=5;

    int [] arr =new int[n];

    System.out.print("enter the array at 0 index  :");
    

    for(int i=0;i<n;i++){

      arr [i]= sc.nextInt();
      System.out.print("enter the element at "+ (i+1) + " index ");

    }




    // int [] arr = {1,2,3,4};

    revers_arr(arr);

    for(int i = 0;i<arr.length;i++){

      System.out.print(arr[i] +" ");






    }



  }





}



































// public class reverse {

//   // [ 1, 2 , 3 ,4 ]  -> [4 , 3 , 2 , 1]

//   public static void reverse(int [] arr){

//     int s = 0;
//     int e = arr.length-1;

//     while(s<=e){

//       int temp = arr[s];
//       arr[s] = arr[e]; 

//       arr[e] = temp;
//       s++ ;
//       e--;

//     }

//   }

//   public static void main(String [] args){

//     int[] arr = {1 ,2, 3, 4};

//     System.out.print(" Original array :");

//     for (int i = 0 ; i <= arr.length-1; i ++){

//       System.out.print(arr[i] + " ");


      

//     }

//     reverse(arr);

//     System.out.println("");

//     System.out.print("Reversed arrayy :");

//     for(int i = 0; i <= arr.length-1; i++){

//       System.out.print(arr[i] + " ");
//     }

//   }



  
// }
