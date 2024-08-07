import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[100];

        // INPUT

        Scanner sc = new Scanner(System.in);

         // System.out.println("Length of array = " + marks.length);

        marks[0] = sc.nextInt();  // phy
        marks[1] = sc.nextInt();  // chem
        marks[2] = sc.nextInt();  // math

        System.out.println("Phy :" + marks[0]);
        System.out.println("Chem :" + marks[1]);
       System.out.println("Math :" + marks[2]);


        //UPDATE

        marks[2] = 100;
        System.out.println("Math :" + marks[2]);
    }
}