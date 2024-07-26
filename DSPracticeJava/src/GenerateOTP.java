import java.util.Random;
public class GenerateOTP {
    public static void main(String[] args) {
        Random random = new Random();
        //to store the random number
        int myOTP = random.nextInt(1000000);
        System.out.println("Your six digit OTP is:" +myOTP);

        
    }
    
}
