package org.core_java.oops.checked_exception;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        BaseClass baseClass=new SubClass();
        baseClass.checkedEx();
    }
}
