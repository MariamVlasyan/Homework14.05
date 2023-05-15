package org.example;

import org.example.Enums.ShapeType;

import javax.print.attribute.standard.PrinterInfo;
import java.lang.reflect.Type;
import java.util.Scanner;

public class ShapeContainerTest {
    public static Shape createShapes(ShapeType shape) {
        ShapeContainerTest c = new ShapeContainerTest();
        switch (shape) {
            case CIRCLE -> { //create a new circle obj and add it to the ShapeContainer
                return new Circle(5.7);
            }
            case RECTANGLE -> { //create a new circle obj and add it to the ShapeContainer
                return new Rectangle(7.5, 4.5);
            }
            default -> //handle invalid input
                    System.out.println("Input is invalid");
        }
        return null;
    }

    public static void printShapeInfo(int index) {
        if (index > 0) {
            ShapeContainer container = new ShapeContainer();
            container.add(new Rectangle(5, 7));
            container.add(new Circle(4));
            container.add(new Rectangle(1, 2));
            container.add(new Circle(3));
            var shapeInfo = container.getIndexOfShape(index);
            System.out.println("New Shape Area is = " + shapeInfo.getArea() + "\nNew Shape perimeter is = " + shapeInfo.getPerimeter());
        } else {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public static void main(String[] args) {
        var rectangle = createShapes(ShapeType.RECTANGLE);
        System.out.println("Rectangle Area = " + rectangle.getArea() + "\nRectangle Perimeter = " + rectangle.getPerimeter());
        var circle = createShapes(ShapeType.CIRCLE);
        System.out.println("Circle Area = " + circle.getArea() + "\nCircle Perimeter = " + circle.getPerimeter());
        printShapeInfo(1);
    }
}

