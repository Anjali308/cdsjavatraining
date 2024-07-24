public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i = 10;
         int sum = 0;
        do{
            
            System.out.println(i);
            sum = sum+i;
            i--;
        }while(i>=1);
        System.out.println(sum);
        String output = (sum %2 == 0)?"Sum is even":"Sum is odd";
        System.out.println(output);
    }
    
}
