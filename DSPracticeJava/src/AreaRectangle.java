import java.util.Scanner;
public class AreaRectangle {
    public static int areaRectangle(int length,int breadth){
    return(length*breadth);
    }
    public static void main(String[] args) {
        System.out.println("Enter length and breadth");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth =sc.nextInt();
        int area = areaRectangle(length,breadth);
        areaRectangle(length,breadth);
        System.out.println(area);
    }
    
}
