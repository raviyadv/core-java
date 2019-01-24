package org.core_java.oops.checked_exception;

public class SubClass extends BaseClass {
    @Override
    /*public void checkedEx()  {
        System.out.println("base class checked");
    }*/
    public void checkedEx()// throws Exception
    {
        System.out.println("base class checked");
    }
}
