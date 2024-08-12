public class CharAt {
    
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Harshal";
        String lastName = "Danav";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Printing One character
        // System.out.println(fullName.charAt(0));
        printLetters(fullName);
    }
}
