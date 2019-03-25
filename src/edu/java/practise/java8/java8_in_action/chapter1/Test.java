package edu.java.practise.java8.java8_in_action.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /**
         * condition to filter weight greater than 100
         */
        List<Fruits> list=getListOfFruits();
        List<Fruits> filterList=new ArrayList();
        for(Fruits fruit:list){

            if(fruit instanceof Apple)
            {
                Apple apple=(Apple) fruit;
                if(apple.getWeight()>120)
                    filterList.add(apple);
            }
            else{
                Orange orange=(Orange) fruit;
                    filterList.add(fruit);
            }
        }
        System.out.println(filterList);

    }

    private static List<Fruits> getListOfFruits() {
        List<Fruits> fruitsList = new ArrayList<>();
        Orange orange = new Orange("orange", 100);
        Orange orange1 = new Orange("orange", 110);
        Orange orange2 = new Orange("orange", 120);
        Orange orange3 = new Orange("orange", 130);
        Orange orange4 = new Orange("orange", 140);
        Apple apple = new Apple("Red", 100);
        Apple apple1 = new Apple("Red", 110);
        Apple apple2 = new Apple("Red", 10);
        Apple apple3 = new Apple("Red", 130);
        Apple apple4 = new Apple("Red", 124);
        Apple apple5 = new Apple("Red", 90);
        fruitsList.add(orange);
        fruitsList.add(orange1);
        fruitsList.add(orange2);
        fruitsList.add(orange3);
        fruitsList.add(orange4);
        fruitsList.add(apple);
        fruitsList.add(apple1);
        fruitsList.add(apple2);
        fruitsList.add(apple3);
        fruitsList.add(apple4);
        fruitsList.add(apple5);
        return fruitsList;
    }
}
