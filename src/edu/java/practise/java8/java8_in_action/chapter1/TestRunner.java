package edu.java.practise.java8.java8_in_action.chapter1;

import edu.java.practise.java8.java8_in_action.chapter1.model.Apple;
import edu.java.practise.java8.java8_in_action.chapter1.model.Orange;
import edu.java.practise.java8.java8_in_action.chapter1.service.Filter;
import edu.java.practise.java8.java8_in_action.chapter1.serviceiml.AppleFilterImpl;
import edu.java.practise.java8.java8_in_action.chapter1.serviceiml.OrangeFilerImpl;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestRunner {
    public static void main(String[] args) {
        List<Apple> appleList = getAppleList();
        List<Orange> orangeList = getOrangeList();

        // pass reference of the Filter custom predicate
        List filteredApple=getFilteredListStatic(appleList, new AppleFilterImpl());
        List filteredOrange=getFilteredListStatic(orangeList, new OrangeFilerImpl());

        System.out.println("Data of Apple:: "+filteredApple);
        System.out.println("Data of Orange:: "+filteredOrange);
        System.out.println("----------------------------------");
        //method reference call of java 8
        //System.out.println(new TestRunner().getFilteredListNonStatic(appleList,AppleFilterImpl::test));

        //with anonymous class
        // here we are not able to create Filter object as lambda expression because compiler always
        // try to solve the lambda type of object on the basis of the cally function list type, here list
        // type of getFilteredListStatic is non generic list, so here we are not able to create Filter Predicate object
        System.out.println("List not generic so lambda not being applied:: "+getFilteredListStatic(appleList, new Filter() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        }));

        // now we change the type of List to generic list and it is working fine now
        System.out.println("Lambda :: "+getFilteredListFilterPredicate(appleList,(apple)->apple.getColor().equalsIgnoreCase("Green")));

        //method reference
        System.out.println("Method Reference:: "+getFilteredListFilterPredicate(appleList,new AppleFilterImpl()::test));

        // another way to filtering by java stream api - which use fork and join methodology
        System.out.println("Stream sequential:: "+appleList.stream().filter(apple -> "Red".equalsIgnoreCase(apple.getColor())).collect(Collectors.toList()));
        System.out.println("Stream parallel:: "+orangeList.parallelStream().filter(orange -> orange.getWeight()>150).collect(Collectors.toList()));

    }

    /**
     * without java 8 filtering, create custom Predicate
     * @param list
     * @param filter
     * @return
     */
    private static List getFilteredListStatic(List list, Filter filter) {
        List filteredList = Stream.of().collect(Collectors.toList());
        // List specific object
        //List<Apple> filterApple=Stream.of(new Apple("",100)).collect(Collectors.toList());
        for (Object item : list) {
            if (filter.test(item))
                filteredList.add(item);
        }
        return filteredList;
    }


    private  List getFilteredListNonStatic(List list, Filter filter) {
        List filteredList = Stream.of().collect(Collectors.toList());
        // List specific object
        //List<Apple> filterApple=Stream.of(new Apple("",100)).collect(Collectors.toList());
        for (Object item : list) {
            if (filter.test(item))
                filteredList.add(item);
        }
        return filteredList;
    }

    private static List getFilteredListFilterPredicate(List<Apple> list, Filter<Apple> filter) {
        List filteredList = Stream.of().collect(Collectors.toList());
        // List specific object
        //List<Apple> filterApple=Stream.of(new Apple("",100)).collect(Collectors.toList());
        for (Apple item : list) {
            if (filter.test(item))
                filteredList.add(item);
        }
        return filteredList;
    }

    /**
     * preparing data for filtering
     *
     * @return
     */
    private static List<Apple> getAppleList() {
        return List.of(
                new Apple("Red", 300),
                new Apple("Red", 155),
                new Apple("Red", 200),
                new Apple("Green", 200),
                new Apple("Red", 130),
                new Apple("Green", 100));
    }

    private static List<Orange> getOrangeList() {
        return List.of(
                new Orange("Orange", 200),
                new Orange("Orange", 160),
                new Orange("Red", 200),
                new Orange("Green", 200),
                new Orange("Orange", 130),
                new Orange("Green", 100));
    }
}

