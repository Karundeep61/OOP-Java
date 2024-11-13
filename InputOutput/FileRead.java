package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileRead <filename>");
            return;
        }

        String fileName = args[0];

        try (FileInputStream fileInput = new FileInputStream(fileName)) {
            int n = fileInput.available();
            System.out.println("Intial bytes available: " + n);

            int bytesToRead = n / 4;
            byte[] buffer = new byte[bytesToRead];
            int bytesRead = fileInput.read(buffer);
            System.out.println("Read first " + bytesRead + " bytes:");
            System.out.println(new String(buffer));

            n = fileInput.available();
            System.out.println("Bytes availabel after first read: " + n);

            int bytesToSkip = n / 2;
            long skippedBytes = fileInput.skip(bytesToSkip);
            System.out.println("Skipped " + skippedBytes + " bytes.");

            n = fileInput.available();
            byte[] remainingBytes = new byte[n];
            bytesRead = fileInput.read(remainingBytes);
            System.out.println("Read remaining " + bytesRead + " bytes:");

            System.out.println(new String(remainingBytes));
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
