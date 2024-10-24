// Rational class for performing arithmetic with fractions
class Rational {
    // Private fields for numerator and denominator
    private int numerator;
    private int denominator;

    // Constructor to initialize a rational number in reduced form
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // Method to compute the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Addition of two rational numbers
    public Rational add(Rational other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Subtraction of two rational numbers
    public Rational subtract(Rational other) {
        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Multiplication of two rational numbers
    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Division of two rational numbers
    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    // Method to print the rational number in a/b form
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // Method to print the rational number in floating-point format
    public void printAsFloat() {
        System.out.println((double) numerator / denominator);
    }
}

// Main class to test the Rational class
public class MainRartional {
    public static void main(String[] args) {
        // Creating two rational numbers
        Rational r1 = new Rational(2, 4); // Should be reduced to 1/2
        Rational r2 = new Rational(3, 8);

        // Displaying the rational numbers
        System.out.print("First Rational Number: ");
        r1.print(); // Output: 1/2

        System.out.print("Second Rational Number: ");
        r2.print(); // Output: 3/8

        // Adding two rational numbers
        Rational sum = r1.add(r2);
        System.out.print("Sum: ");
        sum.print(); // Output: 7/8

        // Subtracting two rational numbers
        Rational difference = r1.subtract(r2);
        System.out.print("Difference: ");
        difference.print(); // Output: 1/8

        // Multiplying two rational numbers
        Rational product = r1.multiply(r2);
        System.out.print("Product: ");
        product.print(); // Output: 3/16

        // Dividing two rational numbers
        Rational quotient = r1.divide(r2);
        System.out.print("Quotient: ");
        quotient.print(); // Output: 4/3

        // Displaying the quotient in floating-point format
        quotient.printAsFloat(); // Output: 1.333...
    }
}
