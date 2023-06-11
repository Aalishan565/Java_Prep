package _2_designPatterns._2_structural._3_proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectToSite("a");
            //internet.connectToSite("abc");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
