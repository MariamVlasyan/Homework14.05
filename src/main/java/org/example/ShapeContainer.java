package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Create a generic Java class called "ShapeContainer<T extends Shape>" that can store
objects that implement the Shape interface. The class should have the following
method
 */
public class ShapeContainer<T extends Shape> {

    public List<T> items;

    public ShapeContainer() {
        items = new ArrayList<>();
    }

    //add(T shape): a method that adds a shape object to the container.
    public void add(T shape) {
        if (shape != null) {
            items.add(shape);
        } else throw new NullPointerException("The argument is null");
    }

    //getIndexOfShape(int index): a method that retrieves the shape object at the given index
    public T getIndexOfShape(int index) {
        return items.get(index);
    }

    //size(): a method that returns the number of shape objects in the container.
    public int size(){
        return items.size();
    }
}
