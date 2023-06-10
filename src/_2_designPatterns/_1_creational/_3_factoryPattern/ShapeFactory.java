package _2_designPatterns._1_creational._3_factoryPattern;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.RECTANGLE) {
            return new Rectangle();
        } else if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        }
        return null;
    }

}
