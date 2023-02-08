package _2_designPatterns._1_creational._2_builder;

public class PhoneConsumer {

    public static void main(String[] args) {
        Phone phone = new Phone.PhoneBuilder().setBrand("iPhone").setName("Iphone 6s").getPhone();
        System.out.println(phone);
    }

}
