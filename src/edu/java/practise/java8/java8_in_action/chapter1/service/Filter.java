package edu.java.practise.java8.java8_in_action.chapter1.service;
@FunctionalInterface
public interface Filter<T> {
    boolean test(T t);
}
