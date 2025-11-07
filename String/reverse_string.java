
public class reverse_string {

  public static void main (String[] args){

    StringBuilder sb = new StringBuilder("hello");


    for(int i = 0; i < sb.length()/2 ; i ++){

      int front = i;

      int last = sb.length() -1 -i;

      char  firstchar = sb.charAt(front);

      char lastchar = sb.charAt(last);

      sb.setCharAt(last,firstchar);
      sb.setCharAt(front, lastchar);

      



    }

    System.out.println(sb);



    // sb.reverse();
    // System.out.println("Reversed String: " + sb);




   





  }
  
}
