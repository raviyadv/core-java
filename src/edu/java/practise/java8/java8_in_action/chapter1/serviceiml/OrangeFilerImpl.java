package edu.java.practise.java8.java8_in_action.chapter1.serviceiml;

import edu.java.practise.java8.java8_in_action.chapter1.model.Orange;
import edu.java.practise.java8.java8_in_action.chapter1.service.Filter;

public class OrangeFilerImpl implements Filter<Orange> {
    @Override
    public boolean test(Orange orange) {
        return "orange".equalsIgnoreCase(orange.getColor())&&orange.getWeight()>100;
    }
}
