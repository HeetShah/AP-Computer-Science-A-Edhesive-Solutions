import java.util.ArrayList;

public class U7_L6_Activity_Two
{

  // Write your insertSort method as described in the assignment
  
  
  
  public static int insertSort (ArrayList<Integer> list) {
     
     int count = 0; //setting a count varibable for execution count
     
     
     //start loop at the index 1 and go to the end of the list
     for (int i = 1; i < list.size(); i++){
       
       int next = list.get(i); //save the index 1 value 
       int j; //initate the second inner loop value
       
       
       //this loop will go back to very start of the list backwards
       for (j = i - 1; j >= 0; j--){
         
         count++;//everytime this inner loop runs, we add 1 to the counter because this is an execution
         
         
         //if the first value of the list is greater than the second, we swap those values
         if(next < list.get(j)) {
           
           list.set(j+1, list.get(j)); //we are setting the value after j, to be the greater value
           
           
         }
         //if the above conditional logic does not get approved, we break the loop
         else { 
           break;
         }
        }
       
       //here we are setting the value of j which is actually less than the index after to be the smaller value
       list.set(j+1, next);
       
     }
     
     return count;
     
     
}
    
}
