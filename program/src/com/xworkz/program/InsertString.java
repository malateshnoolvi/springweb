package com.xworkz.program;

import java.util.ArrayList;
import java.util.Iterator;

public class InsertString {

	public static void main(String[] args) {
		String str = "computer portal";
		ArrayList<String> list = new ArrayList<>();
		list.add(str);
		char[] array = str.toCharArray();
		for (int i = array.length; i <= 0; i++) {
			list.add(2, "Science");
			// System.out.println(list[i]);
		}
		System.out.println(list);
	}

}
