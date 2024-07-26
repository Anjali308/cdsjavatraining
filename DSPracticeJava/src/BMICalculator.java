import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in kilogram");
        double weight =sc.nextDouble();
        System.out.println("Enter Height in meter");
        double height = sc.nextDouble();

        double BMI =weight/ Math.pow(height,2);

        System.out.println("The Body Mass Index is:" +BMI+"kg/m");
        if(BMI<18.5){
            System.out.println("Underweight");
        }
        else if(BMI<25){
            System.out.println("Healthy");
        }
        else if(BMI<30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
    
}
