import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        int pass = marks.nextInt();
        
            switch (pass) {
                case 10:
                System.out.println("Pass with grade E");
                break;
                case 50:
                System.out.println("Pass with grade D");
                break;
                case 80:
                System.out.println("Pass with grade B");
                break;
                case 90:
                System.out.println("Pass with grade A");
                default:
                System.out.println("Enter correct marks");
                    break;
            }

        }
        
            
        }
        
    
    

