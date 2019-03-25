package edu.java.practise.java8.java8_in_action.chapter1;

public class Orange implements  Fruits{
    String color;
    int weight;

    public Orange(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
