package _2_designPatterns._1_creational.factoryPattern;

public class ShapeConsumer {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s = shapeFactory.getShape("Circle");
        s.draw();

    }
}
