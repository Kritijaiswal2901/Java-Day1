import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (4-digit): ");
        int year = scanner.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a valid 4-digit year.");
        } else {
            boolean isLeapYear = false;

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }

            if (isLeapYear) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}
