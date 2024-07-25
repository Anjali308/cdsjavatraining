public class TimeComplexityPrograms {
    public static void main(String[] args) {
        int i, n = 16;
        for (i = 2; i <= n; i=(int)Math.pow(i,2)) {
            System.out.println("Hello World !!!");
        }
    }
    
}
// n=8,itr=2 
// n=12,itr=2
// n=16,itr=3
//Complexity(log(logn))