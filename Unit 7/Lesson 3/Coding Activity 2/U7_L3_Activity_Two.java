import java.util.ArrayList;

public class U7_L3_Activity_Two
{

  // Write the printStatistics method as described in the assignment
  
  public static void printStatistics(ArrayList <Integer> list){
    
     //calculating the sum
    int sum = 0;
  
    for(int i = 0; i < list.size(); i++){
      sum += list.get(i);
    }
    
    
    
    //average 
    double average = sum/list.size();
    
    //mode
    ArrayList < Integer > bag = new ArrayList < Integer > (); 
    ArrayList < Integer > used = new ArrayList < Integer > (); 
    
    for (int num: list) { 
      
      if (!(used.contains(num))) { 
        int value = 0; 
        
        for (int x = 0; x < list.size(); x++) { 
          if (list.get(x) == num) { 
            value++; 
            
          } 
          
        } 
        
        used.add(num); 
        bag.add(value); 
        
      } 
      
    }
    
    Integer top = 0; 
    
    for (int num: bag) { 
      if (num > top) { 
        top = num; 
        
      } 
      
    } 
    
    int amount = 0; 
    String mode = top.toString(); 
    
    for (int num: bag) { 
      if (amount > 1) { 
        mode = "no single mode"; break; 
        
      } 
      
      if (num == top) { 
        amount++; 
        
      } 
      
    } 
    
    if (!(mode.equals("no single mode"))) { 
      mode = list.get(bag.indexOf((int) top)).toString(); 
      
    } 
    
    System.out.println(String.format( "Sum: %s\nAverage: %s\nMode: %s", sum, (double) sum / list.size(), mode )); 
    
  } 
  
}
    
  




