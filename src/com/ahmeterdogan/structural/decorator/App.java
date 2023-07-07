package com.ahmeterdogan.structural.decorator;

/*ChristmasTree interface'ini implement eden bir ChristmasTreeImpl sınıfımız vardı.
Bu sınıfımız bize bir noel ağacı veriyordu. Biz ise bu noel ağacını farklı şekillerde süslemek istiyorduk.
Örneğin BubbleLigths ve Tinseller ile süslemek istediğimiz zaman ChristmasTreeImpl sınıfından türetme işlemi
yaparak bunu yapabilirdik. Ancak hem Bubble hem Tinsel ile süsleme yapmak istersek 3. bir alt sınıf yazmamız gerekecekti.

Bu gibi nedenlerden dolayı Decarotor Design Pattern'i kullandık.

TreeDecator isminde bir abstract class oluşturduk bu sınıfı ilgili interface ile composition ilişkisi kurduk. decorate metodunda
composition ile aldığımız nesneyi decorate ettikten sonra türetilmiş sınıflarda istediğimiz yeni geliştirmeleri yaptık.

 */
public class App {
    public static void main(String[] args) {
        ChristmasTree treeWithBubbleLights = new BubbleLights(new ChristmasTreeImpl()); //Sadece bubble lights ile süsledik
        ChristmasTree treeWithTinsel = new Tinsel(new ChristmasTreeImpl());//Sadece tinsel ile süsledik

        ChristmasTree treeWithBubbleLigthsAndTinsel = new BubbleLights(new Tinsel(new ChristmasTreeImpl())); //Hem bubble ligts hem tinsel ile süsledik

        System.out.println(treeWithBubbleLights.decorate());
        System.out.println(treeWithTinsel.decorate());
        System.out.println(treeWithBubbleLigthsAndTinsel.decorate());
    }
}
