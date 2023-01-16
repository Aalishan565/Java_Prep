package _2_designPatterns._1_creational.abstractFactory;

public abstract class AbstractFactory {
    abstract Color getColor(String colorType);
    abstract Shape getShape(String shapeType);
}
