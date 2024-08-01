import java.util.*;

public class Area {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter radius of a circle:");
    float radius = scan.nextFloat();
    float area = 3.14f * radius * radius;
    System.out.println("Area of a circle:" +area);
 }    
}
