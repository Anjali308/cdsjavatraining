public class ReverseArray {
    public static void reverse(int[] ar){
        int i =0,j=ar.length-1;
        while(i<j){
            int t = ar[i];
            ar[i] = ar[j];
            ar[j] = t;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,7,3,11,24,9};
        reverse(ar);
        System.out.println();
        for(int i = 0;i<ar.length;i++){
            System.out.print(ar[i] + " ");}
          
    }
    
}
