import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string/number to check if it is a palindrome");
        String original = in.nextLine();

        for ( int i = original.length() - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }

}
