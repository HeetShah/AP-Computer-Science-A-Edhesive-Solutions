public class U7_L6_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  
  public static void sortAndPrint (String [] arr){
    
    for (int i = 1; i < arr.length; i++){
      
      String temp = arr[i];
      int possibleIndex = i;
      
      while (possibleIndex > 0 && (temp.compareTo(arr[possibleIndex - 1]) < 0) ){
        arr[possibleIndex] = arr[possibleIndex - 1];
        possibleIndex --;
        
        
      }
        arr[possibleIndex] = temp; 
        
        for(String s : arr){
          System.out.print(s + " ");
        }
        
        System.out.println();
      }
      
    }
    
    
    
  }


