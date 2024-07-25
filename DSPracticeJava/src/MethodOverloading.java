import java.util.Scanner;
public class MethodOverloading {
    public static double todaysaving(double earningUPI,double expensesUPI){
        return (earningUPI - expensesUPI);
    }
    public static void main(String[] args) {
        System.out.println("Enter the today's earing and expense");
        Scanner scanner = new Scanner(System.in);
        int earning = scanner.nextInt();
        int expenses = scanner.nextInt();
        System.out.println("get the amount in upi");
        double earningUPI = scanner.nextDouble();
        double expensesUPI = scanner.nextDouble();
        double savingUPI = todaysaving(earningUPI,expensesUPI);

        System.out.println(savingUPI);
        
    }
    
}
