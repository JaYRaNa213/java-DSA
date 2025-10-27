import java.util.Arrays;
import java.util.Scanner;

public class anagram{

  public static boolean find_anagam(String str1, String str2){

    if(str1.length()!= str2.length()) return false;
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str1.toCharArray();

    Arrays.sort(arr1);

    Arrays.sort(arr2);


    return Arrays.equals(arr1,arr2);

  

  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string one");
    String str1 = sc.next();
    System.out.println("enter the second string");
    String str2 = sc.next();
    sc.close();

    if(find_anagam(str1,str2)){
      System.out.println(str1 + " and " + str2 +" is anagram string" );
    }
    else{
      System.out.println(str1 + " and " + str2 + " is note  anagram");
    }

  }

}






































// import java.util.Arrays;
// import java.util.Scanner;

// public class anagram{

//   // cat ,, act  

//   public static boolean isAnagram(String str1, String str2){

//     if (str1.length() != str2.length()) return false;

//     char [] arr1 = str1.toCharArray();

//     char [] arr2 = str2.toCharArray();

//     Arrays.sort(arr1);
//     Arrays.sort(arr2);

//     return Arrays.equals(arr1,arr2);
//   }

//   public static void main(String[] args) {

//     Scanner sc = new Scanner (System.in);

//     System.out.println("Enter 1 String :");

//     String str1 = sc.next();

//     System.out.println("Enter 2 String :");

//     String str2 = sc.next();

//     sc.close();

//     if(isAnagram(str1,str2)){

//       System.out.print(str1 + " and " + str2 + " are Anagram ");
//     }

//     else {
//       System.out.print(str1 + " and " + str2 + " Are not Anagram ");
//     }

   

    
      
//   }
// }