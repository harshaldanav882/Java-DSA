// Inverted and Rotated Half Pyramid
public class I_R_Pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        // outer or rows
        for(int i=1; i<=n; i++) {
            //Space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         inverted_rotated_half_pyramid(4);
    }
    
}
