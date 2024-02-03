package com.example.devopshomework;

import java.util.ArrayList;
import java.util.List;

public class DevopshomeworkApplication {
	public static void main(String[] args) {
		// Kitapları içeren bir liste oluştur
		List<Kitap> kitapListesi = new ArrayList<>();

		// 10 adet kitap ekleyerek listeyi doldur
		kitapListesi.add(new Kitap("Java Programming", "John Doe", 2022));
		kitapListesi.add(new Kitap("Python Basics", "Jane Smith", 2021));
		kitapListesi.add(new Kitap("Web Development with JavaScript", "Bob Johnson", 2020));
		kitapListesi.add(new Kitap("Data Science Essentials", "Alice Williams", 2019));
		kitapListesi.add(new Kitap("Mobile App Development", "Charlie Brown", 2018));
		kitapListesi.add(new Kitap("Algorithms and Data Structures", "Eva Davis", 2017));
		kitapListesi.add(new Kitap("Database Design", "Frank Miller", 2016));
		kitapListesi.add(new Kitap("Network Security", "Grace Taylor", 2015));
		kitapListesi.add(new Kitap("Artificial Intelligence", "David Wilson", 2014));
		kitapListesi.add(new Kitap("Software Engineering Principles", "Sophie Lee", 2013));

		// Kitapları ekrana yazdır
		for (Kitap kitap : kitapListesi) {
			kitap.yazdir();
			System.out.println(); // Her kitap arasına bir boş satır ekleyelim
		}
	}
}
