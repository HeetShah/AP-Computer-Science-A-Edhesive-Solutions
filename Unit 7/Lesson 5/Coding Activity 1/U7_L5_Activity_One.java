public class U7_L5_Activity_One
{

  //Write the sortAndPrint method described in the assignment
  
  public static void sortAndPrint(String[] arr){
    
      for (int i = 0; i < arr.length - 1; i++){
        
        int low = i; //low variable means that the value comes before the other string and this will be later called with its index in the array
        
        
        //this loop will find whichever string comes before and will be assigned to lwo
        for (int j = i + 1; j < arr.length; j++){
          
          //this loop compares the two strings and if the value is less than 0, arr[j] comes before arr[low]
          if(arr[j].compareTo(arr[low]) < 0){
            
            low = j;
          }
        }
        //swaping the values
        String temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
        
      }
      
      for(String s : arr){
        System.out.print(s + " ");
      }
    
    
  }
  


}
