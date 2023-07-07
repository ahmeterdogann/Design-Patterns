package com.ahmeterdogan.behavioral.mediator;

//Nesneler arasında direkt haberleşmek yerine bir Mediator kullanarak haberleşmeyi sağladık.
//Mediator bize nesneler arasında iletişim kurmamızı sağlayan bir arayüz sağlıyor
public class App {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        Analyst kadir = new Analyst("Kadir", chatRoom);
        Analyst omer = new Analyst("Ömer", chatRoom);
        Programmer ahmet = new Programmer("Ahmet", chatRoom);
        Programmer burak = new Programmer("Burak", chatRoom);

        DevOps ozgur = new DevOps("Ozgur", chatRoom);

        QA furkan = new QA("Furkan", chatRoom);

        ahmet.sendPublicMessage("Geliştirmemi tamamladım arkadaşlar izne çıkıyorum acil durumlarda telefonumdan ulaşabilirsiniz :)");
        System.out.println();
        ahmet.sendPrivateMessage("Selam kadir izinden sonra gönderdiğin analizin geliştirmesine başlayacağım. İyi çalışmalar :)", kadir);


    }
}
