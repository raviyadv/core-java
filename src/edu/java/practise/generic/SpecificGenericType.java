package edu.java.practise.generic;

public class SpecificGenericType<T extends Thread & Runnable> {
    T data;

    void setData(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}
