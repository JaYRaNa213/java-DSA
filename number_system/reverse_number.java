public class reverse_number {

  public static void main(String[] args) {
    String p = "14001";

    int n = Integer.parseInt(p);

    int rev = 0;
    while(n>0){


      int rem = n%10;

      rev = rev *10 + rem;

      n=n/10;
    }
    System.out.println("Reversed Number: " + rev);
  }
  
}
