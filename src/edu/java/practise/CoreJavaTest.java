package edu.java.practise;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class CoreJavaTest {
    static int i=10;
    public static void main(String[] args) throws IOException {
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for (Object obj : keySet) {
            System.out.println("System Property: {"
                    + obj.toString() + ","
                    + System.getProperty(obj.toString()) + "}");
        }
    }
}
