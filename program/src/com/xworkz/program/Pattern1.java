package com.xworkz.program;

public class Pattern1 {
public static void main(String[] args) {
	
	for(int i = 1; i <= 10; i++) {
		for (int j = 1; j<=7; j++) {
			System.out.print("*");
			if(i==2) {
				System.out.println(" ");
			}
		}
		System.out.println();
	}

}
}
