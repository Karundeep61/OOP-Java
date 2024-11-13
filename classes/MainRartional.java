class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Rational add(Rational other) {
        int newNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        int newNumerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational other) {
        if (other.denominator == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void printAsFloat() {
        System.out.println((double) numerator / denominator);
    }
}

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