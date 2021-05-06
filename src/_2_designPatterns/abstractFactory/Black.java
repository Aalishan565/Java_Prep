package _2_designPatterns.abstractFactory;

public class Black implements Color {
    @Override
    public void fill() {
        System.out.println("Fill black color");
    }
}
