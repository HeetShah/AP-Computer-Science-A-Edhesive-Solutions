public class NumStatsArray{

    //Add a final private variable to hold double array
    
    
    private final double[] member;
  
    public NumStatsArray(double[] a){
      //Write constructor code
      member = a;
      
    }
  
    //Implement all methods as described
    public String toString(){
      String x = "{";
      
      for (int i = 0; i <= member.length-1; i++){
        if(i == member.length -1){
          x = x + member[member.length-1] + "}";
        }
        if (i < member.length-1){
           x += member[i] + ", ";
        }
       
      }
      return x;
      
      
    }
  
    public double average(){
  
      double sum = 0;
      
      for(int i = 0; i< member.length; i++){
        sum += member[i];
      }
      
      return sum / (member.length);
       
      
    }
  
    public double range(){
      
      double smallest = member[0];
      double largest = member [0];
      
      for (int i = 1; i < member.length; i++){
        
          if (member[i] > largest){
            largest = member[i];
          } else if (member[i] < smallest){
            smallest = member[i];
          }
          
          
        
      }
      return largest - smallest;
    }
  
    public int sortStatus() {
      
      boolean increase = true;
      boolean decrease = true;
      
      
        for (int i = 0; i < member.length - 1; i++) {
      if (member[i] < member[i + 1]) {
          decrease = false;
          
      }
    }
        
        for (int x = 1; x < member.length-1; x++){
          if (member[x] > member[x+1]){
            increase = false;
          }
        }
          
          if (increase == true) {
            return 1;
          } 
          else if (decrease == true){
            return -1;
          } 
          return 0;
  
      }
      
      
      
     
    }
  
  
  