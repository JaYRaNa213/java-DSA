import java.util.*;

public class majority_element {

  public static void majority_ele(int [] arr){
    HashMap<Integer , Integer> map = new HashMap<>();

    int n = arr.length;
    int value = 0;

    for (int i = 0; i< n; i++){

      if(map.containsKey(arr[i])){

          map.put(arr[i] ,map.get(arr[i] ) + 1);
      }

      else {
        map.put(arr[i], value+1);
      }
    }

    for (int key : map.keySet()){
      if(map.get(key)> n/3){
        System.out.println(key);
      }
    }


  }


  public static void main(String [] args){

    int arr []= {1,1,3,2,2,5,1,3,1,5,2,2,2};
    int arr2 []= {1,2};

    // majority_ele(arr);
    majority_ele(arr2);




  }
  
}
