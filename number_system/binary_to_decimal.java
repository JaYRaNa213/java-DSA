public class binary_to_decimal{

  public static void main(String args[]) {
    String s = "1000";
    int n = s.length();
    int base = 1;


    int ans = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (s.charAt(i) == '1') {
        ans =ans + base;
      }
      base =base * 2;
    }
    System.out.print(ans);
  }
}