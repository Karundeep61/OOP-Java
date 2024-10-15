import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowelCount = 0;
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }
}
