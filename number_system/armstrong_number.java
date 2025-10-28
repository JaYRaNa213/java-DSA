
import java.util.Scanner;

public class armstrong_number {


  public static void isArmstrong(int number){

    int n = number;

    int sum =0;

    while(n>0){

      int ld = n%10;

      sum = sum + (ld *ld*ld);


      n = n/10;

    }


   

    if (sum == number){

      System.out.print("Number is armstrong");
    }

    else{
      System.out.print("Number is not armstrong ");
    }

  }
  public static void main(String[] args){


    Scanner sc= new Scanner(System.in);

    System.out.print(" Enter the number : ");

    int n = sc.nextInt();

    isArmstrong(n);

  }
  
}
