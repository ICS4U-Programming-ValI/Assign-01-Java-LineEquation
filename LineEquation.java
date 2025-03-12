import java.util.Scanner;

/**
 * This is the package for LineEquation.java
 *
 * The LineEquation program asks the user for which value they want to calculate
 * then gets 3 of the following:,
 * x, y, slope, and y-intercept. It then calculates the missing value.
 *
 * <p>This class satisfies style checkers.</p>
 *
 * @version 1.0
 * @since 2025-03-06
 */
public final class LineEquation {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private LineEquation() {
        throw new IllegalStateException("Utility class");
    }

    // function to calculate x
    public static double calculateX(double y, double m, double b) {
        return (y - b) / m;
    }

    // function to calculate y
    public static double calculateY(double x, double m, double b) {
        return m * x + b;
    }

    // function to calculate m (slope)
    public static double calculateM(double x, double y, double b) {
        return (y - b) / x;
    }

    // function to calculate b (y-intercept)
    public static double calculateB(double x, double y, double m) {
        return y - m * x;
    }

    /**
     * This is the main method.
     *
     * @param args .
     */
    public static void main(final String[] args) {
        System.out.print("This program calculates the missing value of a line equation, ");
        System.out.println("y = mx + b.");
        System.out.print("Which of these do you want to calculate: ");
        System.out.println("x, y, slope, and y-intercept.");
        System.out.println("Input the corresponding letter ");
        System.out.println("x (a), y(b), slope(c), and y-intercept(d). ");

        Scanner scanner = new Scanner(System.in);
        String whichValue;

        // do while loop to make sure input is a - d
        do {
            System.out.println("Please enter a, b, c, or d.");
            whichValue = scanner.nextLine().toLowerCase();
        } while (!whichValue.equals("a") && !whichValue.equals("b")
                 && !whichValue.equals("c") && !whichValue.equals("d"));

        // uses if statements to get input and call the right function
        if (whichValue.equals("a")) {
            try {
                System.out.println("Enter the y value: ");
                double yValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the slope: ");
                double mValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the y-intercept: ");
                double bValue = Double.parseDouble(scanner.nextLine());
                System.out.println("The x value is: " + calculateX(yValue, mValue, bValue));
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        } else if (whichValue.equals("b")) {
            try {
                System.out.println("Enter the x value: ");
                double xValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the slope: ");
                double mValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the y-intercept: ");
                double bValue = Double.parseDouble(scanner.nextLine());
                System.out.println("The y value is: " + calculateY(xValue, mValue, bValue));
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        } else if (whichValue.equals("c")) {
            try {
                System.out.println("Enter the x value: ");
                double xValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the y value: ");
                double yValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the y-intercept: ");
                double bValue = Double.parseDouble(scanner.nextLine());
                System.out.println("The slope is: " + calculateM(xValue, yValue, bValue));
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        } else if (whichValue.equals("d")) {
            try {
                System.out.println("Enter the x value: ");
                double xValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the y value: ");
                double yValue = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the slope: ");
                double mValue = Double.parseDouble(scanner.nextLine());
                System.out.println("The y-intercept is: " + calculateB(xValue, yValue, mValue));
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        }

        // close scanner
        scanner.close();
    }
}