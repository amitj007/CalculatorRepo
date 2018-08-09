package com.test.calc;

public class PrintProperties {

	public static void main(String[] args) {
		System.out.println("\nPrinting application properties start...\n");
		for(String arg : args) {
			System.out.println(arg+"\n");
		}
		System.out.println("Printing application properties end...\n");
	}

}
