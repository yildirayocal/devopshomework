package com.example.devopshomework;

import com.example.Kitap;

public class DevopshomeworkApplication {
	public static void main(String[] args) {
		Kitap kitap = new Kitap("Java Programming", "John Doe", 2022);
		kitap.yazdir();
	}
}

