package _2_designPatterns._1_creational._3_factoryPattern;

public class ShapeConsumer {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape s = shapeFactory.getShape("Circle");
        s.draw();

    }
}
