public class MaxMinArray {
    public static void main(String[] args) {
        int nos[]={1,7,3,11,24,9};
        int max=nos[0];
        for(int i=1;i<nos.length;i++){
            if(nos[i]>max){
                max=nos[i];

            }
        }
        System.out.println("Maximum Element in array is:" +max);
        int min = nos[0];
        for( int i=1;i>=nos.length;i++){
            if(nos[i]<min){
                min=nos[i];
            }
        }
        System.out.println("Minimum Element in Array is:" +min);
    }
    
}
