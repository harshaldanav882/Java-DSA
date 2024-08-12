import java.util.Scanner;

public class Two_D_Array {

    public static boolean search(int matrix[][], int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("Found at cell ("+ i +","+ j +")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
    // Printing 2D array
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // User input no.s
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {          // Rows
            for(int j=0; j<m; j++) {       // Colmns
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);

    }
}