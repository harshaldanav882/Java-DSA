public class ReverseNo {
    public static void main(String[] args) {
        int n = 12345;

        while(n > 0) {
            int lastDigit = n % 10;  //For getting Last no.
            System.out.print(lastDigit + " ");
            n = n / 10; //For removing Last no.
        }
        System.out.println();
    }
}
