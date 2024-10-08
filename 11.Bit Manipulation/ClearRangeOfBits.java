public class ClearRangeOfBits {
    public static int clearIBitsinRange(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (i<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBitsinRange(10,2,4));
    }
}
