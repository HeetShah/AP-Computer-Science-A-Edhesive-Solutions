public class U8_L1_Activity_One
{

  // Write your diagSum method as described in the assignment
  public static int diagSum (int [][] arr) {
    
    int sum = 0;
    
    for (int i = 0; i < arr.length; i ++){
    
      for(int j = 0; j < arr[i].length; j++){
        
          if (i == j) {
            sum += arr[i][j];
          }
      }
      
    }
    
    return sum;
    
    
  }

}
