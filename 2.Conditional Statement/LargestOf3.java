public class LargestOf3 {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;

        if( (A >= B) && (A >= C) ) {
            System.out.println("Laargest is A");
        }
        else if(B >= C) {
            System.out.println("Largest is B");
        }
        else {
            System.out.println("Largest is C");
        }

    }
}
