package tutorial8;
import java.util.*;

public class TestCircleWithException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CircleWithException circle;
        double radius;
        do{
            System.out.println("\nEnter value of radius: ");
            radius = sc.nextDouble();
            circle = new CircleWithException(radius);
        
            try {
                System.out.println("Value of radius is: " + circle.getRadius());
                System.out.println("value of diameter is: " + circle.getDiameter());
                System.out.println("value of area is: " + circle.getArea());
            } catch (Exception e) {
                System.err.print(e);
            }
        }while(radius < 1 || radius * radius > 1000);
        

        sc.close();
    }
}
