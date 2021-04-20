import java.util.ArrayList;

public class U7_L3_Activity_One
{
  // Write your shiftRight method here
  
  public static void shiftRight(ArrayList <String> listValues){
    
    //make temp variable to hold last element
    String temp = listValues.get(listValues.size()-1); 

    //make a loop to run through the array list
    for(int i = listValues.size()-1; i > 0; i--)
    {
        //set the last element to the value of the 2nd to last element
        listValues.set(i,listValues.get(i-1)); 
    }
    //set the first element to be the last element
    listValues.set(0, temp); 
  }

}
