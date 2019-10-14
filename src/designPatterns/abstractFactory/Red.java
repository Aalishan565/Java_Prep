package designPatterns.abstractFactory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill red color");
    }
}
