import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result < 0) {
            System.out.println(str1 + " is less than " + str2);
        } else if (result == 0) {
            System.out.println(str1 + " is equal to " + str2);
        } else {
            System.out.println(str1 + " is greater than " + str2);
        }

        sc.close();
    }
}
