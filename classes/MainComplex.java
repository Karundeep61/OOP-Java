// Complex class for arithmetic operations with complex numbers
class Complex {
    // Fields to represent the real and imaginary parts
    private double real;
    private double imaginary;

    // No-argument constructor with default values (0.0 + 0.0i)
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized constructor for initializing complex numbers
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(newReal, newImaginary);
    }

    // Method to print the complex number in a + bi format
    public void print() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

// Main class to test the Complex class
public class MainComplex {
    public static void main(String[] args) {
        // Creating two complex numbers
        Complex num1 = new Complex(3.5, 2.5); // 3.5 + 2.5i
        Complex num2 = new Complex(1.5, -4.5); // 1.5 - 4.5i

        // Displaying the complex numbers
        System.out.print("First Complex Number: ");
        num1.print();

        System.out.print("Second Complex Number: ");
        num2.print();

        // Adding two complex numbers
        Complex sum = num1.add(num2);
        System.out.print("Sum: ");
        sum.print(); // Output: 5.0 - 2.0i

        // Subtracting two complex numbers
        Complex difference = num1.subtract(num2);
        System.out.print("Difference: ");
        difference.print(); // Output: 2.0 + 7.0i

        // Multiplying two complex numbers
        Complex product = num1.multiply(num2);
        System.out.print("Product: ");
        product.print(); // Output: 17.25 - 12.0i
    }
}
