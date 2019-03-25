package edu.java.practise.java8.java8_in_action.chapter1.solu;

public class AppleFilterImplementation implements AppleFilter{
    @Override
    public boolean appleFilterTest(Apple apple) {
        return "red".equalsIgnoreCase(apple.getColor()) && 90 <= apple.getWeight();
    }
}
