import java.util.Scanner;
import javax.swing.*;

public class StringsStartingWithB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JTextArea textArea = new JTextArea(10, 30);
        StringBuilder result = new StringBuilder();

        System.out.println("Enter strings (type 'end' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end"))
                break;
            if (input.toLowerCase().startsWith("b")) {
                result.append(input).append("\n");
            }
        }

        textArea.setText(result.toString());
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Strings Starting with 'B'",
                JOptionPane.INFORMATION_MESSAGE);

        sc.close();
    }
}
