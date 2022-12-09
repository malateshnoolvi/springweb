package com.xworkz.program;

public class Reverse {
	public static void main(String[] args) {
		String[] str = "getting good at coding needs a lot of practice".split(" ");
		String ans = " ";
		for (int i = str.length - 1; i >= 0; i--) {
			ans += str[i] + " ";
		}
		System.out.println("reverse output-" + ans);
	}
}
