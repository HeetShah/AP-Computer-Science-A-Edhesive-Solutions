import java.util.Scanner;
import java.util.ArrayList;

public class U7_L2_Activity_One{

  public static void main(String[] args){
    /* write your code here */
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    
    ArrayList <String> list = new ArrayList<String>();
    
    boolean flag = true; 
    
    String input = "";
    
    while (flag) {
      input = scan.nextLine();
      
      if(input.equals("STOP")){
        flag = false;
      } else {
        list.add(input);
      }
      
    }
    
    System.out.println(list);
    
    for(int i = list.size() -1; i >= 0; i--){
      System.out.println(list.get(i));
    }
    
  }

}
