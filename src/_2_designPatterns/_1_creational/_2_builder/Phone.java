package _2_designPatterns._1_creational._2_builder;

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