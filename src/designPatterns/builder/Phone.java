package designPatterns.builder;

public class Phone {
    private String name;
    private String brand;
    private int prize;
    private int ram;

    public Phone(String name, String brand, int prize, int ram) {
        this.name = name;
        this.brand = brand;
        this.prize = prize;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", prize=" + prize +
                ", ram=" + ram +
                '}';
    }
}
