public class SortingArray {
    public static void printArray(int nos[]){
        for(int i=0;i<nos.length;i++){
            System.out.println(nos[i]+"");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nos[] = {1,7,3,11,24,9};
        //insertion sort
        for(int i=1;i<nos.length;i++){
            int current = nos[i];
            int j = i-1;
            while(j>=0 && nos[j]>current){
                nos[j+1] = nos[j];
                j--;
                
                }

            
            nos[j+1] = current;
        }
        printArray(nos);


    }
    
    
}
