public class SumOf_1st_NaturalNo {
    public static int calSum(int n) {
        if(n==1) {
            return 1;
        }
        int snm1 = calSum(n-1);
        int sn = n + calSum(n-1);
        return sn;
    }
    public static void main(String[] args) {
        int n = 5;
       System.out.println(calSum(n));
    }
}
