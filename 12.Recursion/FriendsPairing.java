public class FriendsPairing {
    public static int frnds_Pairing(int n) {
        // Base Case
        if(n == 1 || n == 2) {
            return n;
        }
        // // Choices
        // // Single

        // int fnm1 = frnds_Pairing(n-1);

        // //Pair

        // int fnm2 = frnds_Pairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totWays

        // int totWays = fnm1 + pairWays;
        // return totWays;

        return frnds_Pairing(n-1) + (n-1) * frnds_Pairing(n-2);
    }
    public static void main(String args[]) {
System.out.println(frnds_Pairing(3));
    }
}
