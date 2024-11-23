package InputOutput;

import java.io.File;

public class JavaFileLister {
    public static void main(String[] args) {
        File currentDirectory = new File(".");

        System.out.println("Listing all .java files in the directory " + currentDirectory.getAbsolutePath());
        listJavaFiles(currentDirectory);
    }

    public static void listJavaFiles(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    listJavaFiles(file);
                } else {
                    if (file.getName().endsWith(".java")) {
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }

}