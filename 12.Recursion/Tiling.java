public class Tiling {
    public static int tilingProblem(int n) {
        // 2 * n (Floor Size)

        // Base Case
        if(n==0 || n==1) {
            return 1;
        }

        // Work We will be doing
        // Choices

        // Vertical Choice
        int fnm1 = tilingProblem(n-1);
        // Horizontal choice
        int fnm2 = tilingProblem(n-2);

        // Total Choices
        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String args[]) {

        System.out.println(tilingProblem(4));
    }
}
