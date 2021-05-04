public class TemperatureMonth{

    private double[][] temperatures;
  
    public TemperatureMonth(double[][] t){
      temperatures = t;
    }
  
    public double getMaxTemp(){
      // Remove return and implement getMaxTemp method here
      
      double high = temperatures[0][0];
      
      for (int i = 0; i < temperatures.length; i++){
         for  (int j = 0; j < temperatures[i].length; j++){
           if(temperatures [i][j] >= high ){
           high = temperatures [i][j];
         }
      }
    
    }
    return high;
    }
  
    public double getMinTemp(){
      // Remove return and implement getMinTemp method here
      double low = 0;
      
      for (int i = 1; i < temperatures.length; i++){
         for  (int j = 1; j < temperatures[i].length; j++){
           if(temperatures [i][j] >= temperatures [i-1][j-1]  )
           low = temperatures [i-1][j-1];
         }
      }
      
      return low;
    }
  
    public double getMonthlyAverage(){
      // Remove return and implement getMonthlyAverage method here
      double sum = 0;
      double count = 0;
      
      for (int i = 0; i < temperatures.length; i++){
         for  (int j = 0; j < temperatures[i].length; j++){
           
           
           sum += temperatures [i][j];
           count ++;
         }
      }
      
      return sum / count;
    }
  
    public double[] getWeeklyAverages(){
      // Remove return and implement getWeeklyAverages method here
        double sum = 0;
      
      double average = 0;
      double [] averageArray = new double [temperatures.length];
      
      for (int i = 0; i < temperatures.length; i++){
        
        
        sum = 0;
        
         for  (int j = 0; j < temperatures[i].length; j++){
           
           sum += temperatures [i][j];
  
            
         }
         
         averageArray[i] = sum/temperatures[i].length; 
      }
      
      return averageArray;
      
    }
  
  }
  