public class StringStatsArray{

    //Add a final private variable to hold String array
    private final String[] holder; 
  
    public StringStatsArray(String[] a){
      //Write constructor code
      
       holder = a;
    }
  
    //Implement all methods as described
    public String toString(){
       String x = "{";
      
      for (int i = 0; i <= holder.length-1; i++){
        if(i == holder.length -1){
          x = x + "\"" + holder[holder.length-1] + "\"" + "}";
        }
        else if (i < holder.length-1){
           x += "\"" + holder[i] + "\"" + ", ";
        }
       
      }
      return x;
    }
  
    public double averageLength(){
      
      double total = 0;
      
      for(int i = 0; i < holder.length; i++){
        total += holder[i].length();
      }
      
      return total/(holder.length); 
      
      
    }
  
    public int search(String target){
      
  
      for (int i = 0; i < holder.length; i++){
        
        if(holder[i].equals(target)){
          return i;
        }
      }
      
      return -1;
      
    }
  
    public int sortStatus() {
      
      boolean ascending = true;
       boolean descending = true;
    
      for (int i = 1; i < holder.length; i++){
        if (holder[i].compareTo(holder[i-1]) < 0){
          ascending = false;
        }
      }
       
       
      for (int i = 1; i < holder.length; i++){
        if (holder[i].compareTo(holder[i-1]) > 0) {
          descending = false;
        }
      }
      
      if(ascending == true){
        return 1; 
      } else if(descending == true){
        return -1;
      } return 0; 
       
       
    } 
  
    
    
    
  }
  
  
  
  
  