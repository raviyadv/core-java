package edu.java.practise.constructor;

public class ChildClass extends ParentClass{
    public ChildClass()throws Exception{
        super();
        System.out.println("ChildClass().."+this.hashCode()+" "+super.hashCode());
    }
    public ChildClass(int i) throws Exception{
        this();
    }

    public static void main(String[] args) throws Exception{
        ChildClass childClass=new ChildClass();
     int    i=20;
        System.out.println(i);
    }
}
