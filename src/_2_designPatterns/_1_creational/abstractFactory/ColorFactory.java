package _2_designPatterns._1_creational.abstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("black")) {
            return new Black();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

}
