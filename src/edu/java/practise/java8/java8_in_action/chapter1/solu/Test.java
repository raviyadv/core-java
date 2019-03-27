package edu.java.practise.java8.java8_in_action.chapter1.solu;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", 100);
        Apple apple1 = new Apple("Red", 110);
        Apple apple2 = new Apple("green", 10);
        Apple apple3 = new Apple("Red", 130);
        Apple apple4 = new Apple("green", 124);
        Apple apple5 = new Apple("Red", 90);
        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
        System.out.println(filterApple(appleList, 90, "red"));
        System.out.println(filterApple1(appleList, new AppleFilter() {
            @Override
            public boolean appleFilterTest(Apple apple) {
                return "red".equalsIgnoreCase(apple.getColor()) && 90 <= apple.getWeight();
            }
        }));
        /**
         * next way of calling to filter1 function is that we create a implementation of AppleFilter class and
         * pass the reference of the implementation class
         * and there is way when filter has been changed we change in implementation class.
         * If we notice here AppleFilter is an Functional Interface so it mean that we can create the object of the
         * AppleFilter functional interface instance by lambda expression. Lambda expression internally create the anonymous class
         * of lambda expression, as we create above, lambda expression just gives us an way of creating an implementation of functional interface in
         * just single line of code.
         */
        System.out.println(filterApple1(appleList, (app) -> "red".equalsIgnoreCase(app.getColor()) && 90 <= app.getWeight()));
        /**
         * if single arg of function than we can remove the () parenthesis
         */
        System.out.println(filterApple1(appleList, app -> "red".equalsIgnoreCase(app.getColor()) && 90 <= app.getWeight()));

        /**
         * there is another concept call method reference, if the anonymous class is somewhere defined already or some other
         * class is defined and we want to leverage the functionality of that method, so we can pass the method reference as
         * an argument. constructor argument is also there. we use :: double dot operator we pass the method reference.
         * for lambda expression we use the arrow token symbol ->
         *
         */
        /**
         * static method we can call by class reference.
         */
        //  System.out.println(filterApple1(appleList,AppleFilterImplementation::appleFilterTest);
        AppleFilter appleFilter = new AppleFilterImplementation();
        System.out.println(filterApple1(appleList, appleFilter::appleFilterTest));
    }

    private static List<Apple> filterApple(List<Apple> appleList, int weight, String color) {
        /**
         * so every time we need to change the condition of filter on the basis of requirement.
         * so next method id another solution.
         */
        List<Apple> newFilteredList = new ArrayList<>();
        for (Apple apple : appleList) {
            if (color.equalsIgnoreCase(apple.getColor()) && weight <= apple.getWeight())
                newFilteredList.add(apple);
        }
        return newFilteredList;
    }

    private static List<Apple> filterApple1(List<Apple> appleList, AppleFilter appleFilter) {
        List<Apple> newFilteredList = new ArrayList<>();
        for (Apple apple : appleList) {
            if (appleFilter.appleFilterTest(apple))
                newFilteredList.add(apple);
        }
        return newFilteredList;
    }

}
