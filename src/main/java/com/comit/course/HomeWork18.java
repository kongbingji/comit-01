package com.comit.course;
import java.util.Scanner;

public class HomeWork18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter First Number:");
		
		Scanner input1 = new Scanner(System.in);
		
		double a = input1.nextDouble();
		
		System.out.println("Enter Second Number:");
		
		Scanner input2 = new Scanner(System.in);
		
		double b = input1.nextDouble();
		
		if (a<b)
		{
			System.out.println(b + " is the is the largest and" + a + " is the smallest.");
		}
		else if(a>b)
		{
			System.out.println(a + " is the is the largest and" + b + " is the smallest.");
		}
		else
		{
			System.out.println("First Number equals Second Number.");
		}
		
	}

}
