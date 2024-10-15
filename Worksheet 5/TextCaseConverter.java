import java.util.Scanner;

public class TextCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String inputText = sc.nextLine();

        String upperCaseText = inputText.toUpperCase();
        String lowerCaseText = inputText.toLowerCase();

        System.out.println("Uppercase: " + upperCaseText);
        System.out.println("Lowercase: " + lowerCaseText);

        sc.close();
    }
}
