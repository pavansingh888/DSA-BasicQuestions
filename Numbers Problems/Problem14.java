import java.util.Scanner;

public class Problem14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Check if year is divisible by 4
        if (year % 4 == 0) {
            // If divisible by 100, it must also be divisible by 400 to be a leap year
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true; // Divisible by 4 but not by 100
            }
        } else {
            return false; // Not divisible by 4
        }
    }
}

