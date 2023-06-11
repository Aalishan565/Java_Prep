package _2_designPatterns._2_structural._3_proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    static List<String> bannedSites = new ArrayList<>();
    private Internet realInternet = new RealInternet();

    static {
        bannedSites.add("a");
        bannedSites.add("b");
        bannedSites.add("c");
        bannedSites.add("d");
    }

    @Override
    public void connectToSite(String siteName) throws Exception {
        if (bannedSites.contains(siteName)) {
            throw new Exception("Access denied");
        }
        realInternet.connectToSite(siteName);

    }
}
