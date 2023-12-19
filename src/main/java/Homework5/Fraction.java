package Homework5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fraction other = (Fraction) obj;

        return numerator == other.numerator && denominator == other.denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first fraction:");
        Fraction fraction1 = readFractionFromConsole(scanner);

        System.out.println("Enter the second fraction:");
        Fraction fraction2 = readFractionFromConsole(scanner);

        if (fraction1.equals(fraction2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static Fraction readFractionFromConsole(Scanner scanner) {
        System.out.print("Enter the fraction (numerator/denominator): ");
        String input = scanner.next();

        String[] parts = input.split("/");
        try {
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            return new Fraction(numerator, denominator);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please enter a fraction in the form 'numerator/denominator'.");
            System.exit(1);
            return null;
        }
    }
}
