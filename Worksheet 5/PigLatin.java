import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer st = new StringTokenizer(sentence);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.print(convertToPigLatin(word) + " ");
        }

        sc.close();
    }

    public static String convertToPigLatin(String word) {
        return word.substring(1) + word.charAt(0) + "ay";
    }
}
