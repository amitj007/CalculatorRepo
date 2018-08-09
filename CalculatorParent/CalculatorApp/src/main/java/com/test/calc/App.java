package com.test.calc;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter first no..");
		int a = s.nextInt();
		System.out.println("Enter second no..");
		int b = s.nextInt();
		System.out.println("Enter operation from (a, s, m or d)");
		String o = s.next();
		s.close();
		Calculator c = new CalculatorImpl();
		switch(o) {
		case "a":
			c.add(a, b);
			break;
		case "s":
			c.sub(a, b);
			break;
		case "m":
			c.mul(a, b);
			break;
		case "d":
			c.div(a, b);
		}
	}
}
