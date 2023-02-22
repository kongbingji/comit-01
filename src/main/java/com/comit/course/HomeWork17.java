package com.comit.course;
import java.util.Scanner;

public class HomeWork17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Canadian Dollar Amout: ");
		Scanner input = new Scanner(System.in);
		//input a canadian dollar amount//
		double j = input.nextDouble();
		//declare a variety represent US dollar//
		double a;
		a = j*0.74;
		
		System.out.println("USD"+a);
	}

}
