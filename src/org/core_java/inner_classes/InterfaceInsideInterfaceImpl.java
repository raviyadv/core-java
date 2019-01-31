package org.core_java.inner_classes;

public class InterfaceInsideInterfaceImpl implements InterfaceInsideInterface,InterfaceInsideInterface.Inner{
    @Override
    public void m2() {
        System.out.println("Hello");
    }

    @Override
    public void m1() {
        System.out.println("Hello m1");
    }

    public static void main(String[] args) {
        InterfaceInsideInterface interfaceInsideInterface=new InterfaceInsideInterfaceImpl();
        interfaceInsideInterface.m2();
        ((InterfaceInsideInterfaceImpl) interfaceInsideInterface).m1();
    }
}
