import java.util.*;

public class dec_to_number {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the value of number : ");

      // 11 - > 

      int n = sc.nextInt();

      String ans = "";

      while (n>0) { 

        int rem = n%2;

        ans = rem + ans;

        n= n/2;
      }

      System.out.print(ans);

  }

  
  
}

