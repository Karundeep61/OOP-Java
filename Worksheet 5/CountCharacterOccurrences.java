import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter several lines of text (type 'end' to finish):");
        StringBuilder text = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if (line.equals("end"))
                break;
            text.append(line).append(" ");
        }

        System.out.print("Enter the character to search for: ");
        char searchChar = sc.next().charAt(0);

        int occurrences = 0;
        int index = text.indexOf(String.valueOf(searchChar));

        while (index != -1) {
            occurrences++;
            index = text.indexOf(String.valueOf(searchChar), index + 1);
        }

        System.out.println("Occurrences of '" + searchChar + "': " + occurrences);

        sc.close();
    }
}
