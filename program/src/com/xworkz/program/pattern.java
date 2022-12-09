package com.xworkz.program;

public class pattern {
	public static void main(String[] args) {
		int k=6;
		for(int i = 1; i <= k; i++) {
			for (int j = k; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
//		for(int i = 1; i <= k; i--) {
//			for (int j = k; j>=i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
	}

}
