
import java.util.*;

public class Find_disappared_Numbers {

  static void swap (int []arr ,int i , int j ){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]  = temp;
  }


 
    public static void main(String[] args) {

      int [ ] arr = { 2,3,1,2,4,3};
       Arrays.sort(arr);

      ArrayList <Integer> arr1 = new ArrayList<>();
        
        
       

      
        System.out.print("Sorted array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

      int i = 0;
       while(i < arr.length) {

            int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {

              swap(arr, i , correct);

              
            }

            else {
              i++;
            }
        }

        System.out.print(" Correct indexed elements :");

        for (int j = 0; j < arr.length; j++){

          System.out.print(  arr[j] + " ");
        }


        for (i = 0 ; i < arr.length ; i ++){
          if (arr[i] != (i+1)){
            arr1.add(i+1);

          }
        }

        System.out.println();

        System.out.print(" Missing elements: [ ");
        for (i = 0 ; i < arr1.size() ; i ++){
         
            System.out.print(" " +arr1.get(i) + " ,");
          
        }

        System.out.print(" ]");
        
        
    }  
}
