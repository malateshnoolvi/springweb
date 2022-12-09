package com.xworkz.program;

import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();

		// Input ; [Hello, hi, Wow, cute, thanks, hi, Aww, cute, hello, beloved, Aww]

		set.add("Hello");
		set.add("hi");
		set.add("Wow");
		set.add("cute");
		set.add("thanks");
		set.add("hi");
		set.add("Aww");
		set.add("cute");
		set.add("hello");
		set.add("beloved");
		set.add("Aww");
		
		System.out.println(set);

	}

}
