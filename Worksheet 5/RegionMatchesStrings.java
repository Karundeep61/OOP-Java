import java.util.Scanner;

public class RegionMatchesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter the number of characters to compare: ");
        int len = sc.nextInt();

        System.out.print("Enter the starting index: ");
        int index = sc.nextInt();

        boolean result = str1.regionMatches(true, index, str2, index, len);

        if (result) {
            System.out.println("The selected region is equal.");
        } else {
            System.out.println("The selected region is not equal.");
        }

        sc.close();
    }
}
