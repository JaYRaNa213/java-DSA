
import java.util.*;

public class Itinerary_ticket{

  public static String getfffStart(HashMap<String , String> tick){
    HashMap<String,String> revTick = new HashMap<>();
    for (String key : tick.keySet()){

      // key - > key , value -> tick.get(key)

      revTick.put(tick.get(key), key);

    }

    System.out.println(revTick);

    for (String key : tick.keySet()){
      if(!revTick.containsKey(key)){
      

        return key;
      }
    }
    

    return null;



    }

  public static void main(String [] args){

    

    HashMap<String , String> tickets = new HashMap<>();


    tickets.put("Chennai" ,"Benglore");
    tickets.put("mumbai" ,"delhi");
    tickets.put("goa","Chennai");
    tickets.put("delhi" ,"goa");


    System.out.print(tickets);

    String start = getfffStart(tickets);

    while(tickets.containsKey(start)){

      System.out.print(start + " --> ");
      start = tickets.get(start);
    }

    System.out.print(start);

  }
}