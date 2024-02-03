package com.example;

public class Kitap {
    private String ad;
    private String yazar;
    private int yil;

    public Kitap(String ad, String yazar, int yil) {
        this.ad = ad;
        this.yazar = yazar;
        this.yil = yil;
    }

    public void yazdir() {
        System.out.println("Kitap Adı: " + ad);
        System.out.println("Yazar: " + yazar);
        System.out.println("Yıl: " + yil);
    }
}
