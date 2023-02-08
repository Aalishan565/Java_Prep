package _2_designPatterns._1_creational._2_builder;

public class Phone {

    private String name;
    private String brand;
    private int prize;
    private int ram;

    public Phone(PhoneBuilder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.prize = builder.prize;
        this.ram = builder.ram;
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

    static class PhoneBuilder {
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
            return new Phone(this);
        }

    }

}
