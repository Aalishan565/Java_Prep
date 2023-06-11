package _2_designPatterns._2_structural._3_proxy;

public class RealInternet implements Internet {

    @Override
    public void connectToSite(String siteName) {
        System.out.println("Connected to " + siteName);
    }
}
