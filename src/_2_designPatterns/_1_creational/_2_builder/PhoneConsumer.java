package _2_designPatterns._1_creational._2_builder;

public class PhoneConsumer {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setBrand("iPhone")
                .setName("Apple").getPhone();
        System.out.println(phone);
    }

}
