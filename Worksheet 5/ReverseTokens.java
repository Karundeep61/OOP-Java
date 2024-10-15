import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Stack;

public class ReverseTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        Stack<String> tokens = new Stack<>();

        while (st.hasMoreTokens()) {
            tokens.push(st.nextToken());
        }

        System.out.println("Tokens in reverse order:");
        while (!tokens.isEmpty()) {
            System.out.println(tokens.pop());
        }

        sc.close();
    }
}
