package com.test.calc;

public class CalculatorImpl implements Calculator {

	public void add(int a, int b) {
		System.out.println("Addition of "+ a +" and "+ b +" is "+(a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Subtraction of "+ a +" and "+ b +" is "+(a - b));
	}

	public void mul(int a, int b) {
		System.out.println("Multiplication of "+ a +" and "+ b +" is "+(a * b));
	}

	public void div(int a, int b) {
		System.out.println("Divison of "+ a +" and "+ b +" is "+(a / b));
	}

}
