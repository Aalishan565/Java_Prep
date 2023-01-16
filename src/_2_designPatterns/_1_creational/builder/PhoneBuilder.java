package _2_designPatterns._1_creational.builder;

public class PhoneBuilder {

    private String name;
    private String brand;
    private int prize;
    private int ram;

    public String getName() {
        return name;
    }

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public int getPrize() {
        return prize;
    }

    public PhoneBuilder setPrize(int prize) {
        this.prize = prize;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Phone getPhone() {
        return new Phone(name, brand, prize, ram);
    }

}
