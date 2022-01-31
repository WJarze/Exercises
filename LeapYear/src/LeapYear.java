import java.util.Scanner;

public class LeapYear {

    public static void leapYear() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the Leap Year: ");
            int readData = sc.nextInt();
            if ((readData % 4 == 0) && (readData % 100 != 0) || (readData % 400 == 0)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("is not Leap Year");
            }
        } while (true);
    }

    public static void main(String[] args) {
        leapYear();
    }
}
