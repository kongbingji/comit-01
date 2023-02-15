package com.comit.course._01_.operator;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b = 3;
		
		int sum = a + b;
		int sub = a - b;
		double div = (double)a / b;
		int mul = a * b;

		System.out.println("Addition:" + sum);
		System.out.println("Substraction:" + sub);
		System.out.println("Division:" + div);
		System.out.println("Multplicaion:" + mul);
		
		int mod = a % b;
		System.out.println("Modulus:" + mod);

		
		
	}

}
