package edu.java.practise.java8.java8_in_action.chapter1.serviceiml;

import edu.java.practise.java8.java8_in_action.chapter1.service.Filter;
import edu.java.practise.java8.java8_in_action.chapter1.model.Apple;

public class AppleFilterImpl implements Filter<Apple> {

    @Override
    public boolean test(Apple apple) {
        return "red".equalsIgnoreCase(apple.getColor())&&apple.getWeight()>150;
    }
}
