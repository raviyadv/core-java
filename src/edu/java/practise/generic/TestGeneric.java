package edu.java.practise.generic;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {
        GenericArrayList genericArrayList=new GenericArrayList();
        genericArrayList.setData("Hello");
        genericArrayList.setData(100);

        GenericArrayList<String> data=new GenericArrayList<>();
        data.setData("100");

        SpecificGenericType<Thread> specificGenericType=new SpecificGenericType<>();

        GenericArrayList<? extends ArrayList> wildCardBoundedType=new GenericArrayList<>();
    //    wildCardBoundedType.setData("Hello");
        Thread t=new Thread();
          wildCardBoundedType.setData(null);

    }
}
