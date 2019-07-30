package edu.java.practise.java8.java8_in_action.chapter1.model;

import java.util.Objects;

public class Orange {
    private String color;
    private int weight;

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return weight == orange.weight &&
                Objects.equals(color, orange.color);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
