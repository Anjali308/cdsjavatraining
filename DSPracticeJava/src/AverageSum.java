public class AverageSum {
    public static void main(String[] args) {
        int[] nos = {1,7,3,11,24,9};
        int length =nos.length;
        int sum =0;
        for(int i=0;i<length;i++){
            sum = sum + nos[i];
        }
        System.out.println("Sum of elements of array:" +sum);
        float average = (float)sum/length;
        System.out.println("Average of elements of array:" +average);
    }
    
}
