// Without Consecutive zero's

public class NoConsecutiveZeros {
    public static void printBinStrings(int n, int lastPlace, String str) {
        // Base Case
        if(n == 0) {
            System.out.println(str);
            return;
        }

        // Work

        if(lastPlace == 1) {
            // If 0 is last
            printBinStrings(n-1, 0, str + "0");
            printBinStrings(n-1, 1, str + "1"); 
        } else {
            printBinStrings(n-1, 0, str +"1");
        }

        //Work    -> below is a some what clean code

        // printBinStrings(n-1, 0, str +"0");
        // if(lastPlace == 0) {
        //     printBinStrings(n-1, 1, str +"1"); 
        // }

    }
    public static void main(String[] args) {
         printBinStrings(3,1,"");
    }
}
