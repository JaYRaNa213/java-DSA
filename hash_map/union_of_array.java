

import java.util.*;
public class union_of_array {
public static void union(int []arr1, int [] arr2){
  
  HashSet<Integer > set = new HashSet<>();

  for(int i = 0; i < arr1.length; i ++){

    set.add(arr1[i]);
  }
  for(int i = 0; i < arr2.length; i ++){

    set.add(arr2[i]);
  }


  System.out.println(set.size());

  

  System.out.println(set);

  
}
  public static void main(String[] args) {
    int arr1 [] = {9,3,2,1,9};
    int arr2 [] = {5,2,6,1,6,4};

    union(arr1,arr2);
  }
  
}
