import java.util.Scanner;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Convert INR to USD");
        System.out.println("2.Convert USB to INR");
        System.out.println("Enter the number of your choice:");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                USDtoINR();
                break;
            case 2:
                INRtoUSD();
                break;
            default:
                 System.out.println("Choice is invalid");    

        }
    }
    private static void USDtoINR(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in INR:");
        double valueINR=sc.nextDouble();
        double valueUSD=valueINR/83.77;
        System.out.println("USD value for given INR value is $" +valueUSD);
    }
    private static void INRtoUSD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in USD:");
        double valueUSD=sc.nextDouble();
        double valueINR=valueUSD*83.77;
        System.out.println("INR value for given USD value is Rs." +valueINR);
    }
    
}
