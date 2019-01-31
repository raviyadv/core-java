package org.core_java.enumeration;

public enum Color {
    BLUE,RED{
        public void info(){
            System.out.println("Dangerous color");
        }},GREEN;
    public void info(){
        System.out.println("Universal Color");
    }

    public static void main(String[] args) {
        Color[] color=Color.values();
        for(Color col:color)
            col.info();
    }
}
