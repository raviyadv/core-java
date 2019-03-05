package edu.java.practise.generic;

import java.util.ArrayList;

public class GenericArrayList<T> {
    T data;
    ArrayList arrayList;
    public T getData(){
        return data;
    }
    public void setData(T data){
        this.data=data;
    }

    public void wildTypeSetData(ArrayList<?> data){
        this.arrayList=data;
    }

}
