import java.util.*;

public class Expect10 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    do {
        System.out.print("Enter your no.:");
        int n = sc.nextInt();

        if(n % 10 == 0) {
            continue;
        }
        System.out.println("No. was n:" + n);


    } while(true);
    
 }
}