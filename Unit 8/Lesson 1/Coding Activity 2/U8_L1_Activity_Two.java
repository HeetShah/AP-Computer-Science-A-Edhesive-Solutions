public class U8_L1_Activity_Two
{

  // Write your multTable method as described in the assignment
  public static int [][] multTable(int row, int column){
    
    int [][] arr = new int [row][column];
    
      for (int i = 0; i < row; i ++){
    
      for(int j = 0; j < column; j++){
        arr [i][j] = i * j; 
        
          
      }
      
    }
    
    return arr;
    
  }

}
