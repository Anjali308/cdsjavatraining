import java.util.Scanner;

public class DimondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); 
        for(int i =0;i<row;i++){
            for(int j =0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row;i>0;i--){
            for(int j =0;j<row-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
    
}
