public class ButterflyPattern {

    public static void butterfly(int n) {
       // 1st half
       for(int i=1; i<=n; i++) {
        // stars = i

        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        //Spaces = 2*(n-1)
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        //Stars = i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }

       // 2st half
       for(int i=n; i>=1; i--) {
         
        // stars = i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        //Spaces = 2*(n-1)
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        //Stars = i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
       }

       }
    
    public static void main(String[] args) {
        butterfly(4);
    }
}
