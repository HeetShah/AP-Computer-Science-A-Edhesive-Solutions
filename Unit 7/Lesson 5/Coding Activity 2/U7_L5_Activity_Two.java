import java.util.ArrayList;

public class U7_L5_Activity_Two
{

  // Write your selectSort method as described in the assignment
  
  public static void selectSort(ArrayList<Integer> list){
    
    //every number in the array except the last one
    for(int i = 0; i < list.size() - 1; i++){
      
      
      //store the lowest value in the array list 
      int lowest = i;
      
      //loop to find the smallest value in the arraylist
      for(int j = i + 1; j < list.size(); j++){
        
        //logic for deciding which value is smaller
        if(list.get(j) < list.get(lowest)){
          lowest = j;
        }
        
        
        
        
      }
      
              //swapping the values
        int temp = list.get(i);
        list.set(i, list.get(lowest));
        list.set(lowest, temp);
      
    
      
      
    }

  }

}
