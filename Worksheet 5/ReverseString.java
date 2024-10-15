import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed using StringBuilder: " + sb.reverse().toString());

        // Using String
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed using String: " + reversed);

        sc.close();
    }
}
