package com.ahmeterdogan.structural.proxy;

public class App {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("edevlet.com");
            internet.connectTo("eksisozluk.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
