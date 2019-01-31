package org.core_java.generic;

import java.util.ArrayList;

public class TestWildCard {
    public static void main(String[] args) {
        ArrayList<A> aType = new ArrayList<>();
        ArrayList<B> bType = new ArrayList<>();
        ArrayList<C> cType = new ArrayList<>();
        A a = new A();
        B b = new B();
        C c = new C();
        aType.add(a);
        aType.add(b);
        aType.add(c);
        bType.add(b);
        //  bType.add(c);
        //  bType.add(a);
        //  cType.add(a);
        //  cType.add(b);
        cType.add(c);
       // aType=bType;
       // bType=aType;
          aType=aType;

          ArrayList<String> stringList=new ArrayList<>();
          stringList.add("String List");

          m1(aType);
          m1(bType);
          m1(cType);
    //      m1(stringList);


        m2(aType);
    //    m2(bType);
    //    m2(cType);
     //   m2(stringList);

        ArrayList<?> genTypeList=new ArrayList<>();
    //    genTypeList.add(a);

        ArrayList<? extends A> aTypeList=new ArrayList<>();
    //     aTypeList.add(a);


        ArrayList<? super A> aTypeListWild=new ArrayList<>();
        aTypeListWild.add(a);
        aTypeListWild.add(b);
        aTypeListWild.add(c);

    }
        public static void m1(ArrayList<? extends A> arrayList){
            A a =(A)arrayList.get(0);
       //     arrayList.add(new A());
            a.testA();
        }
        public static void m2(ArrayList<? super A> arrayList){
            A a=(A)arrayList.get(0);
            arrayList.add(new A());
            a.testA();
        }

}
