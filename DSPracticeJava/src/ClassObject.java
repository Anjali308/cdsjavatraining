import java.util.Scanner;
public class ClassObject {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        System.out.println("Enter the trainer name:");
        Scanner scanner = new Scanner(System.in);
        trainer.trainerName = scanner.nextLine();
        System.out.println("Enter the trainer technology:");
        trainer.trainerTechnology = scanner.nextLine();

        Student student = new Student();
        System.out.println("Enter the student name");
        Scanner sc =new Scanner(System.in);
        student.studentName = scanner.nextLine();
        System.out.println("Enter the student technology:");
        student.enrolledTechnology = scanner.nextLine();

        trainer.nameConcatenate("Pawan","Sharma");
        
        System.out.println(trainer.trainerName+trainer.trainerTechnology);
        System.out.println(student.studentName+student.enrolledTechnology);
        
    }
    
}
class Trainer{
    String trainerName;
    String trainerTechnology; 

    public static void nameConcatenate(String Fname , String Lname){
        System.out.println(Lname + Fname);
    }
    }
class Student{
    String studentName;
    String enrolledTechnology;

}