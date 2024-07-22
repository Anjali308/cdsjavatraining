
public class nestedifelse {
    
    public static void main(String[] args) {
        int age = 17;
        int weight = 55;

        if(age>=18)
           if(weight>50){
            System.out.println("Person can donate blood");
           }
           else{
            System.out.println("Person cannot donate blood");
           }
        else{
            System.out.println("Age must be greater than 18");
        }   
           
    }
    
}
