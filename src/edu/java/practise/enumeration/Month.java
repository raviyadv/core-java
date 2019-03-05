package edu.java.practise.enumeration;

public enum Month {
    /**
     *    internally every enum is type of java.lang type, and class type
     *    public static final Month JANUARY=new Month();
     *    public static final Month FEBRUARY=new Month();
     */
    JANUARY(1),FEBRUARY("FEB");
    int position;
    String name;
    Month(){
        System.out.println("Constructor");
    }
    Month(int position){
        this.position=position;
    }
    Month(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        System.out.println(Month.JANUARY);
        System.out.println(Month.JANUARY.name);
        System.out.println(Month.JANUARY.position);

        System.out.println(Month.FEBRUARY);
        System.out.println(Month.FEBRUARY.name);
        System.out.println(Month.FEBRUARY.position);

        Month[] month=Month.values();
        System.out.println(month[0]);
        System.out.println(Month.valueOf("JANUARY"));

        System.out.println(Month.FEBRUARY.name=="FEB");

        System.out.println(Month.JANUARY.equals(Month.JANUARY));
    }
}

