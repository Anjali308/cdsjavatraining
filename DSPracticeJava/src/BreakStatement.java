public class BreakStatement {
    public static void main(String[] args) {
        
        for( int i=1;i<=10;i++){
        //System.out.println(i);
        
        if(i==6)
            continue;
            System.out.println(i);
         }
         System.out.println("Even no. using continue");
         for(int i=1;i<=10;i++){
            
            if(i%2!=0)
            continue;
            System.out.println(i);
        }
         

             
    }
    
    }
