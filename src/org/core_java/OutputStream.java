package org.core_java;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class OutputStream {
    public static void main(String[] args)throws IOException {
        System.out.println("Hello");
        printOnPrintStream();
    }
    private static void printOnPrintStream() throws IOException {
        System.setOut(new PrintStream(new File("./file_folder/output.txt")));
        System.out.println("Hello File Print");
    }
}
