
public class remove_duplicate {


  public static void main(String[] args){


    LL list = new LL();
  }

  public class Node{

    private int value;
    private int next;
    private int  node;
  }
  

  public void remove_duplicat(){

    Node node = head;

    while(node.next!= null){
      if(node.value == node.next.value){

        node.next = node.next.next;
        size--;
      }
      else{
        node = node.next;
      }
    }

    tail = node;
    tail.next = null;
  }
}
