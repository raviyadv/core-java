package org.core_java.constructor;

import java.io.IOException;

public class ParentClass {
    public ParentClass(int a)throws RuntimeException {
        System.out.println("ParentClass(int a)..");
    }
    ParentClass()throws IOException{
        this(10);
        System.out.println("ParentClass().."+this.hashCode());
    }
}
