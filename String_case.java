


































public class String_case{
  public String Charecter_converter(String str){
    char [] arr = str.toCharArray();
    char i =0;
    char n= arr.length();

    for(char i=0;i<n;i++){
      if(charAt(arr[i]).isUpperCase){
        arr[i]=charAt(arr[i]).isLowerCase;
      }
      else{
        arr[i]=CharAt(arr[i]).toUpperCase;
      }

    }


  }



  
}




// public class String_case {

//   // JaY - > jAy

//   public String Togglecase(String str) {

//     char [] arr = str.toCharArray();

//     for ( int i = 0; i < arr.length ; i ++){
//          if(Character.isUpperCase(arr[i])){
//              arr[i]=Character.toLowerCase(arr[i]);

//          }

//          else {
//           arr[i] = Character.toUpperCase(arr[i]);
//          }

//     }

//     return new String(arr);

//   }


//   public static void main(String[] args){

//     String_case obj = new String_case();

//     String input = "JaY RanA";

//     String result = obj.Togglecase(input);

//     System.out.println("Original String : " + input);

//     System.out.println("Toggle String :  " + result);



//   }
  
// }
