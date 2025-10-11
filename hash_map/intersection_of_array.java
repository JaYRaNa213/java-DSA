import java.util.*;

public class intersection_of_array {

  public static void inter(int [] arr1, int [] arr2){

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr1.length; i ++){

      set.add(arr1[i]);
    }

    System.out.print("arr2 is : [ ");

    for (int i = 0; i < arr2.length; i ++){

      System.out.print( "  " + arr2[i] + ", ");
    }


    System.out.println(" ]");
    System.out.print(" Set of arr1 is : ");
    System.out.println(set);
    


    int count = 0;

    System.out.print(" Matched element are : ");

    for (int j = 0 ; j< arr2.length; j++){

      if(set.contains(arr2[j])){
        count ++;

        System.out.print("  "+ arr2[j]+ " ");
        set.remove(arr2[j]);
      }
      

    }

    System.out.println("matched element count is " + count);



  }

  public static void main(String[] args) {

    int [] arr1 = {1,3,2,5};
    int [] arr2 = {3,6,5,7,1};
    inter(arr1,arr2);

    // System.out.print(a);


    
  }
  
}
