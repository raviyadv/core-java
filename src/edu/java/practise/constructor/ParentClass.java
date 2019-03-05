package edu.java.practise.constructor;

import java.io.IOException;

public class ParentClass {
    static int i=10;
    public ParentClass(int a)throws RuntimeException {
        System.out.println("   ");
    }
    ParentClass()throws IOException{
        this(10);
        System.out.println("ParentClass().."+this.hashCode());
    }
}
