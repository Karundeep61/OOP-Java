import java.util.Scanner;
import javax.swing.*;

public class StringsEndingWithED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JTextArea textArea = new JTextArea(10, 30);
        StringBuilder result = new StringBuilder();

        System.out.println("Enter strings (type 'end' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end"))
                break;
            if (input.toUpperCase().endsWith("ED")) {
                result.append(input).append("\n");
            }
        }

        textArea.setText(result.toString());
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Strings Ending with 'ED'",
                JOptionPane.INFORMATION_MESSAGE);

        sc.close();
    }
}
