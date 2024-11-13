package InputOutput;

import java.io.File;

public class FileProperties {
    public static void main(String[] args) {
        String filePath = "Example.txt";

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("Is Writable: " + file.canWrite());
            System.out.println("Is Executable: " + file.canExecute());
            System.out.println("File Size (in bytes): " + file.length());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}