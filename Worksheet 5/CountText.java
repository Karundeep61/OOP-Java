import java.util.Scanner;

public class CountText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type 'end' to finish):");
        int lines = 0, words = 0, chars = 0;

        while (true) {
            String line = sc.nextLine();
            if (line.equals("end"))
                break;
            lines++;
            chars += line.length();
            words += line.split("\\s+").length;
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);

        sc.close();
    }
}
