package com.ahmeterdogan.structural.adapter;

//özet olarak ingiltereye gittiğimizde türk tipi fişimiz için bir bakkala gidip converter aldığımızı düşünüyoruz
public class App {
    public static void main(String[] args) {
        EnglishTypeSocket socket = new EnSocket();
        EnglishDevice enTelevision = new EnTelevision();
        socket.getVolt(enTelevision);

        //Turk yapımı fişe sahip bir televizyon düşünelim EnglishType bir socket'i direkt kullanamayacağı için bir adaptöre ihtiyacı vardır
        TurkishDevice trTelevision = new TrTelevision();
        //socket.getVolt(trTelevision); ---> Hata alacaktır çünkü english tipi prizin arayüzü türk tipi cihaza uygun değil

        TrEnAdapter trEnAdapter = new TrEnAdapter(new TrTelevision());

        socket.getVolt(trEnAdapter); //Adapter classı sayesinde turk tipi cihazlar ile English tipi prizler arasında uyum sağladık


    }
}
