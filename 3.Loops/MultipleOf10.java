import java.util.*;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your no.: ");
            int n = sc.nextInt();

            if(n % 10 == 0) {
                System.out.println(n + " "  + "is a multiple of 10");
                break;
                
            }
            System.out.println(n + " "  + "is not a multiple of 10");
        } while(true);
    }
}
