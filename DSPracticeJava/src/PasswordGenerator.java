import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String Uppercase = "ABCFGDHYTKM";
        String Lowercase = "avsfdhetyrk";
        String number = "0123456789";
        String combination = Uppercase+Lowercase+number;
        int length = 8;
        char[] password=new char[length];
        Random random =new Random();
        for(int i=0;i<length;i++){
            password[i]=combination.charAt(random.nextInt(combination.length()));
        } 
        System.out.println("Generated Password is:"+new String(password));
    }
    
}
