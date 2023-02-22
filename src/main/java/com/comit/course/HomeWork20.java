package com.comit.course;
import java.util.Scanner;

public class HomeWork20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int B;
		System.out.print("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		B = input.nextInt();
		if (B > 0)
		{
			System.out.println(B+" is positive.");
		} else if (B < 0)
		{
			System.out.println(B+" is negative.");
		
		} else
		{
			System.out.println(B+" is positive.");			
		}
	}

}
