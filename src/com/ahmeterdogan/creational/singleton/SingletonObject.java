package com.ahmeterdogan.creational.singleton;

//Bir sınıftan program boyunca hafızada sadece bir nesne yaratılması durumu

//1. implementasyon
public final class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        if (instance == null)
            instance = new SingletonObject();

        return instance;
    }
}

//2. implementasyon
final class SingletonObjectWithFinalStaticField {
    private final static SingletonObjectWithFinalStaticField INSTANCE = new SingletonObjectWithFinalStaticField();
    private SingletonObjectWithFinalStaticField() {

    }

    public static SingletonObjectWithFinalStaticField getInstance() {
        return INSTANCE;
    }
}

//3. implementasyon
enum SingletonWithEnum {
    INSTANCE;
}
class App {
    public static void main(String[] args) {
        SingletonObject s1 = SingletonObject.getInstance();
        SingletonObject s2 = SingletonObject.getInstance();
        System.out.println(s1 == s2);

        SingletonObjectWithFinalStaticField sf1 = SingletonObjectWithFinalStaticField.getInstance();
        SingletonObjectWithFinalStaticField sf2 = SingletonObjectWithFinalStaticField.getInstance();
        System.out.println(sf1 == sf2);


        SingletonWithEnum se1 = SingletonWithEnum.INSTANCE;
        SingletonWithEnum se2 = SingletonWithEnum.INSTANCE;
        System.out.println(se1 == se2);

    }
}