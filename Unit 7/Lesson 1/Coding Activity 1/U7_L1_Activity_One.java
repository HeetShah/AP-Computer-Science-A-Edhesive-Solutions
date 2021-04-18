import java.util.Scanner;
import java.util.ArrayList;

public class U7_L1_Activity_One{
  

  public static void main(String[] args){
    /* write your code here */
    
    boolean flag = true;
    
    Scanner scan = new Scanner (System.in);
    
    ArrayList <String> list = new ArrayList <String>();
    
    System.out.println("Please enter words, enter STOP to stop the loop.");
    
    String input = "";
    
    while(flag) {
      
       input = scan.nextLine();
      
      if(input.equals("STOP")){
        flag = false;
       
      
      } else {
        list.add(input);
      }
    }
    
     System.out.println(list.size());
    System.out.println(list);
    
        
        if(list.size() > 2){
        list.remove(0);
        list.remove(list.size() - 1);
        
        }
        
        System.out.println(list);
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
