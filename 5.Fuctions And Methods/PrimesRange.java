public class PrimesRange {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i ==0) {
                isPrime = false;
                break;
                // return isPrime;
                // return false;
            }
        }
        return isPrime;
        // return true;
    }
    public static void primesInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {  //true
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primesInRange(20);
    }
}
