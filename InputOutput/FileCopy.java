package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source file> <destination file>)");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("File copied Successfully.");
        } catch (IOException e) {
            System.out.println("Error occured: " + e.getMessage());
        }
    }

}