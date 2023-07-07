package com.ahmeterdogan.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private Internet internet = new RealInternet();
    private static List<String> bannedAddresses;

    static {
        bannedAddresses = new ArrayList<>();
        bannedAddresses.add("eksisozluk.com");
        bannedAddresses.add("twittter.com");
    }

    @Override
    public void connectTo(String address) throws Exception {
        if (bannedAddresses.contains(address.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(address);
    }
}
