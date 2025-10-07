import java.util.ArrayList;
import java.util.Arrays;

public class find_duplicates {

  static void swap (int []arr ,int i , int j ){

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]  = temp;
  }


 
    public static void main(String[] args) {

      int [ ] arr = { 1,3,4,2,2};
       Arrays.sort(arr);

      
        System.out.print("Sorted array elements : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

      int i = 0;
       while(i < arr.length) {

            if(arr[i]!= i+1){
              int correct = arr[i] -1;
            if (arr[i] != arr[correct]) {

              swap(arr, i , correct);
            }

            else {
              System.out.println(arr[i]);
              break;
            }
            }

            else {
              i++;
            }
           
        }

        
        
    }  



  
}
