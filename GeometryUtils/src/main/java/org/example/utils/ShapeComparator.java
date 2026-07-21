package org.example.utils;

import org.example.geometry.Shape;

public class ShapeComparator {

    public static boolean isLargerArea(Shape s1, Shape s2) {
        return s1.calculateArea() > s2.calculateArea();
    }

    public static boolean isEqualArea(Shape s1, Shape s2) {
        return Math.abs(s1.calculateArea() - s2.calculateArea()) < 0.001;
    }

    public static boolean isLargerPerimeter(Shape s1, Shape s2) {
        return s1.calculatePerimeter() > s2.calculatePerimeter();
    }

    public static Shape findMaxArea(Shape... shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }
        Shape max = shapes[0];
        for (Shape s : shapes) {
            if (s.calculateArea() > max.calculateArea()) {
                max = s;
            }
        }
        return max;
    }
}
