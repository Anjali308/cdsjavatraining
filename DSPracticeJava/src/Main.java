import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int age = scanner.nextInt();
       System.out.println("My age is:" +age);
       String adult = (age>=18)? "eligible for vote":"not eligible for vote";
       System.out.println(adult);

    }
}
