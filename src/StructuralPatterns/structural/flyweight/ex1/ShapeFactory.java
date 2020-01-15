package StructuralPatterns.structural.flyweight.ex1;

import java.util.HashMap;

class ShapeFactory {
    private static final HashMap<String, Shape> shapeMap = new HashMap<>();

    static Shape getCircle(String color) {
        Shape circle = shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    public static int numberOfShapes(){
        return shapeMap.size();
    }
}
