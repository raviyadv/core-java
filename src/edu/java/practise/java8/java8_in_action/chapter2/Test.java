package edu.java.practise.java8.java8_in_action.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple(100, "red"),
                new Apple(150, "red"),
                new Apple(130, "green"),
                new Apple(110, "green"));

        /**
         * general approach was there is i create a ApplePredicate function and i pass a parameter for such requirement
         * but here i create a generic predicate which can be used for all type of use case.
         */
        System.out.println(filterApple(appleList, new Predicate<Apple>() {
            @Override
            public boolean test(Apple apple) {
                return "red".equalsIgnoreCase(apple.getColor());
            }
        }));

        System.out.println(filterApple(appleList, (apple) -> "green".equalsIgnoreCase(apple.getColor())));
        /**
         * Benefit of writing code in such way that, we can expand our code on changes of requirement.
         * we can do more change on filter method in such a way that it accept all types of element
         */
        System.out.println(filter(appleList, apple -> apple.getWeight() >= 120));
        /**
         * if we are writing return statement than we can use the curly parenthesis.
         * or if multiple statement are there than we use the curly braces
         * for parameter also - if one parameter is there than we no need to use small braces ().
         */
        System.out.println(filter(appleList, apple -> {
            return apple.getWeight() >= 120;
        }));

    }

    public static List<Apple> filterApple(List<Apple> listOfApple, Predicate<Apple> predicate) {
        List<Apple> filteredApple = new ArrayList<>();
        for (Apple apple : listOfApple) {
            if (predicate.test(apple))
                filteredApple.add(apple);
        }
        return filteredApple;
    }

    /**
     * generic implementation of filter method
     * now it can accept orange, apple or any kind of list to filter
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredApple = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element))
                filteredApple.add(element);
        }
        return filteredApple;

    }
}
