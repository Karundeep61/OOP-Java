import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneNumberTokenization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a telephone number (format: (555) 555-5555): ");
        String phoneNumber = sc.nextLine();

        StringTokenizer st = new StringTokenizer(phoneNumber, "()- ");

        String areaCode = st.nextToken();
        String firstPart = st.nextToken();
        String secondPart = st.nextToken();

        String fullNumber = firstPart + secondPart;

        int areaCodeInt = Integer.parseInt(areaCode);
        long phoneNumberLong = Long.parseLong(fullNumber);

        System.out.println("Area code: " + areaCodeInt);
        System.out.println("Phone number: " + phoneNumberLong);

        sc.close();
    }
}
